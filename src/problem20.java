import java.math.BigInteger;

public class problem20{
	public static void main(String[] args){
		BigInteger fact = BigInteger.valueOf(100);
		
		for(int i = 1; i<100; i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		System.out.println("And the answer is (drumroll) : ");
		String bigNumString = fact.toString();
		int sum = 0;
		for(int i = 0; i<bigNumString.length(); i++){
			sum+= Integer.parseInt(Character.toString(bigNumString.charAt(i)));
		}
		System.out.println(sum);
	}
}