import java.math.BigInteger;


public class problem48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum = BigInteger.ZERO;
		BigInteger one = new BigInteger("1");
		BigInteger count = new BigInteger("1");
		for(int i=1; i<=1000; i++){
		    BigInteger pow = count.pow(i);
		    sum = sum.add(pow);
		    count = count.add(one);
		}
		System.out.println(sum.toString().substring(sum.toString().length()-10, sum.toString().length()));
	}

}
