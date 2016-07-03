
import java.util.HashSet;


public class problem23 {
	public static void main(String[] args){ 
		/* 
		 * get all abundant numbers under 28123 and place them in a list
		 * loop through all abundant numbers
		 * for each iteration, loop to 28123 and for each of those iterations,
		 * subtract the current abundant number and find if the difference is an abundant number
		 * if it is an abundant number, then that number is the sum of two abundant numbers, and the loop should continue
		 */
		 int answer = 395465626;
		 
		 HashSet<Integer> list = findAllAbundants();
		 HashSet<Integer> abundantSums = new HashSet<Integer>();
		 
		 for(int i:list){
			 
			 for(int j = 1; j<=28123; j++){
				 
				int difference = j-i;
				
				if(list.contains(difference) && !abundantSums.contains(j)){
					System.out.println(j);
					answer-=j;
					abundantSums.add(j);
				}
			 }
		 }
		 System.out.println(answer);
	}
	
	public static HashSet<Integer> findAllAbundants(){
		HashSet<Integer> list = new HashSet<Integer>();
		for(int i = 12; i< 28123; i++){
			if(isAbundant(i)){
				list.add(i);
			}
		}
		return list;
	}
	
	public static boolean isAbundant(int num){
		if(num == 0){
			return false;
		}
		int sum = 1;
		for(int i = 2; i<=Math.sqrt(num); i++){
			if(num%i == 0){
				sum+=i;
				if(num/i != i){
					sum+=num/i;
				}
			}
		}
		
		if(sum > num){
			return true;
		}
		return false;
	}
}
