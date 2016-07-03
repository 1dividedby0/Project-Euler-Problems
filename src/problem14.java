
public class problem14 {
	static int i = 3;
	static int largestSequenceCount = 0;
	static double currentSequenceNum = 1;
	static int currentSequenceCount = 1;
	static int answer = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		while(i<1000000){
			runCollatz();
		}
		System.out.println(answer);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	public static void runCollatz(){
		currentSequenceNum = collatzThis(currentSequenceNum);
		currentSequenceCount++;
		if(currentSequenceNum != 1){
			runCollatz();
		}else{
			i++;
			currentSequenceNum = i;
			if(currentSequenceCount>largestSequenceCount){
				largestSequenceCount = currentSequenceCount;
				answer = i-1;
			}
			currentSequenceCount = 0;
		}
	}
	public static double collatzThis(double n){
		return (n%2==0)?(n/2):(n*3+1);
	}
}
