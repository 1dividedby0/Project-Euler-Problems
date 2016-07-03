
public class problem34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int[] factorials = new int[9];
		factorials[0] = 1;
		for(int i = 2; i<=9; i++){
			int factorial = 1;
			for(int j = 1; j<i+1; j++){
				factorial*=j;
			}
			factorials[i-1] = factorial;
		}
		for(int i:factorials)
			System.out.println(i);
		int sum = 0;
		for(int i = 10; i<2540160; i++){
			int digitsSum = 0;
			for(char d:Integer.toString(i).toCharArray()){
				int digit = Character.getNumericValue(d);
				if(digit != 0){
					digit = factorials[digit-1];
				}else{
					digit = 1;
				}
				
				digitsSum+=digit;
			}
			if(i==digitsSum){
				sum+=i;
				System.out.println(i);
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("The sum of all numbers which are equal to the sum of the factorial of their digits is:");
		System.out.println(sum);
		System.out.println("This solution took " + (end-start) + " milliseconds.");
		
	}

}
