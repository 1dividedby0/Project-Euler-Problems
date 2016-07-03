import java.math.BigInteger;
import java.util.HashSet;


public class problem29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		HashSet<BigInteger> hs = new HashSet<BigInteger>();
		for(int i = 2; i<=100; i++){
			for(int j = 2; j<=100; j++){
				hs.add(BigInteger.valueOf(i).pow(j));
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(hs.size() + " is the answer to problem 29. This was found in " + (end-start) + " milliseconds.");
	}

}
