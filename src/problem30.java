
public class problem30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for(int num = 2; num<999999; num++){
			String str = Integer.toString(num);
			int sum = 0;
			for(int i = 0; i<str.length(); i++){
				double val = Character.getNumericValue(str.charAt(i));
				sum+= Math.pow(val, 5.0);
			}
			if(sum == num)
				total+=sum;
		}
		System.out.println(total);
	}
}
