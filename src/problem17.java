import java.math.*;
public class problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] singles = {"one","two","three","four","five","six","seven","eight","nine"};
		String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] doubles = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		int hundred = 7;
		int thousand = 11;
		int and = 3;
		int total = thousand;
		for(int i = 1;i<1000; i++){
			if(i<10){
				total += singles[i-1].length();
			// add in teens
			}else if(i>10 && i<20){
				total += teens[i-11].length();
			// add in tens below 100
			}else if(i%10 == 0 && i<100 && i>9){
				total += doubles[i/10-1].length();
			// all the other numbers such as 21,22,23,24,25, ..., 99
			}else if(i<100){
				total += doubles[Math.floorDiv(i, 10)-1].length() + singles[i%10-1].length();
			// all the complete 100s such as 100, 200, 300, 400, 500, ..., 900
			}else if(i%100 == 0 && i>0){
				total += singles[i/100-1].length() + hundred;
			// every thing else such as 101, 102, 103, ..., 999
			}else if(i>100){
				int hundredAnd = singles[Math.floorDiv(i, 100)-1].length() + hundred + and;
				// if the number is like 110, 120, 130, ..., 990
				if(i%10 == 0){
					total += hundredAnd + doubles[Math.floorDiv(i%100,10)-1].length();
				// if the number is like 101,102,103,104,105, ... 109, 201, ... 209
				}else if(i%100 < 10 && i%100 > 0){
					total += hundredAnd + singles[i%100-1].length();
				// if the number is in the hundreds teens
				}else if(i%100 > 10 && i%100 < 20){
					total += hundredAnd + teens[i%100-11].length();
				// if the number is any other number in the hundreds
				}else{
					total += hundredAnd + doubles[Math.floorDiv(i%100, 10)-1].length() + singles[i%100%10-1].length();
				}
			}
		}
		System.out.println(total);
	}
}