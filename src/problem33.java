
public class problem33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		String finalFraction = "1/1";
		for(int i = 11; i<100; i++){
			char[] iSpl = Integer.toString(i).toCharArray();
			for(int j = 11; j<100; j++){
				char[] jSpl = Integer.toString(j).toCharArray();
				if(i!=j && i<j){
					if(Character.getNumericValue(jSpl[1]) != 0 && Character.getNumericValue(iSpl[1]) != 0){
						//ystem.out.println(Character.getNumericValue(jSpl[1]));
						if((double)Character.getNumericValue(iSpl[0])/Character.getNumericValue(jSpl[1]) == (double)i/j && iSpl[1] == jSpl[0]){
							String[] arr = finalFraction.split("/");
							arr[0] = Integer.toString(Integer.parseInt(arr[0])*i);
							arr[1] = Integer.toString(Integer.parseInt(arr[1])*j);
							finalFraction = arr[0] + "/" + arr[1];
						}
					}
				}
			}
		}
		String[] arr = finalFraction.split("/");
		int divisor = 2;
		int max = 2;
		int numerator = Integer.parseInt(arr[0]);
		int denominator = Integer.parseInt(arr[1]);
		while(divisor<=numerator){
			if(denominator%divisor == 0 && numerator%divisor == 0){
				max = divisor;
			}
			divisor++;
		}
		long end = System.currentTimeMillis();
		System.out.println("The denominator of the product of the four nontrivial digit cancelling factions is: ");
		System.out.println(Integer.parseInt(arr[1])/max);
		System.out.println("This solution took " + (end-start) + " milliseconds.");
	}

}
