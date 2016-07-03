import java.math.BigInteger;


public class problem25 {
	static BigInteger prev = BigInteger.valueOf(1);
	static BigInteger current = BigInteger.valueOf(1);
	static int counter = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long startTime = System.currentTimeMillis();
		System.out.println(next());
		final long endTime = System.currentTimeMillis();
		System.out.println("This problem took " + (endTime-startTime) + " milliseconds for me to solve");
	}
	public static int next(){
		BigInteger temp = current;
		BigInteger tempPrev = prev;
		current = current.add(prev);
		prev = temp;
		counter++;
		if(tempPrev.add(temp).toString().length() == 1000)
			return counter;
		return next();
	}
}
