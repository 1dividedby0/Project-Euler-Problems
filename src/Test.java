import java.math.BigInteger;
import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(perm(new int[]{1,3,7,9}, 3, 0, new ArrayList<Integer>()));
		//for(int d = 43; d<15; d++){
			//System.out.println("1/" + 4 + " has a recurring cycle length of " + findRecurringCycleSizeOf(938));
		//}
		
		//System.out.println(perm(new int[]{1, 2, 3, 4,5,6,7,8,9}, 9, 0, new ArrayList<Integer>()));
	}
	public static ArrayList<Integer> perm(int[] characters, int size, int num, ArrayList<Integer> list){
		if(Integer.toString(num).length() == size){
			System.out.println(num);
			list.add(num);
		}
		else{
			for(int i:characters){
				perm(characters, size, Integer.parseInt((Integer.toString(num)+Integer.toString(i))), list);
			}
		}
		return list;
	}
	
	public static int findRecurringCycleSizeOf(int num){
		String nines = "9";
		
		while(new BigInteger(nines).mod(BigInteger.valueOf(num)) != BigInteger.ZERO){
			nines+="9";
			//System.out.println(new BigInteger(nines));
		}
		return nines.length();
	}
	
}
