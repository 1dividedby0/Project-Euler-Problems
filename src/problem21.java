
public class problem21 {
	private static int answer = 0;
	public static void main(String[] args){
		for(int i = 1; i<=10;i++)
			System.out.println(calculateSumOfDivisorsOf(i));
		
		for(int a = 1; a<10000; a++){
			int b = calculateSumOfDivisorsOf(a);
			if(calculateSumOfDivisorsOf(b) == a && b<a){
				//amicable numbers
				//a is always amicable
				answer+=a;
				if(b<10000){
					//b is an amicable number under 10000
					answer+=b;
				}
			}
		}
		System.out.println(answer);
	}
	public static int calculateSumOfDivisorsOf(double num){
		String divisors = "1";
		int sum = 0;
		for(int i = 2; i< Math.sqrt(num); i++){
			if(num%i == 0){
				divisors+= " " + i;
				if(num/i != i){
					divisors += " " + num/i;
				}
			}
		}

		double[] divisorsArr = new double[divisors.split("\\s+").length];
		for(int i = 0; i< divisors.split("\\s+").length; i++)
			divisorsArr[i] = Double.parseDouble(divisors.split("\\s+")[i]);
		
		for(int i = 0; i < divisorsArr.length; i++)
			sum+= divisorsArr[i];
		
		return sum;
	}
}
