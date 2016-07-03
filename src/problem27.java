
public class problem27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		
		int max = 0;
		int aMax = 0;
		int bMax = 0;
		for(int a = -1000; a<=1000; a++){
			for(int b = -1000; b<=1000; b++){
				int numOfPrimes = findPrimes(a,b);
				if(numOfPrimes>max){
					max = numOfPrimes;
					aMax = a;
					bMax = b;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println("The sequence of length " + max + " is found using the equation n squared + n * " + aMax + " + " + bMax);
	}
	
	
	
	public static int findPrimes(int a, int b){
		int subject = 0;
		while(true){	
			subject++;
			int prime = Math.abs(subject * subject + subject * a + b);
			if(!isPrime(prime)){
				break;
			}
		}
		return subject;
	}
	
	public static boolean isPrime(int x){
		for(int i = 2; i<x/2; i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}

}
