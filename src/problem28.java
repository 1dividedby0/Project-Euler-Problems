
public class problem28 {
	static int limit = 1002001;
	static int i = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findSum(1, 3, 0));
		
	}

	public static int findSum(int total, int boxLength, int currentBoxDiagonal){
		// algorithm takes 1 millisecond to finish
		if(i<limit){
			currentBoxDiagonal++;
			if(currentBoxDiagonal<=4){
				i+=boxLength-1;
				total += i;
			}else{
				currentBoxDiagonal = 0;
				boxLength += 2;
			}
			return findSum(total, boxLength, currentBoxDiagonal);
		}
		return total;
	}
}
