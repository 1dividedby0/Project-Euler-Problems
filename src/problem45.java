
public class problem45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 40756;
		while(true){
			int checkTriangular = (8 * i) + 1;
			boolean triangular = Math.round(Math.sqrt(checkTriangular))==Math.sqrt(checkTriangular);
			
			boolean pentagonal = (Math.sqrt(24 * i + 1) + 1)%6 == 0;
			
			if(triangular && pentagonal)
				break;
			
			i++;
		}
		System.out.println(i);
	}
	
}
