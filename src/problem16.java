import java.math.BigInteger;
public class problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		String s = n.toString();
		int sum = 0;
		for(int i =0;i<s.length();i++){
			Character c = new Character(s.charAt(i));
			sum += Character.getNumericValue(c);
		}
		System.out.println(sum);
	}

}
