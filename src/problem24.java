
public class problem24 {
	static int counter = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] store = {0,1,2,3,4,5,6,7,8,9};
		
		while(counter<=999999){
			store = nextPerm(store);
			counter++;
		}
		for(int i:store)
		System.out.print(i);
	}
	
	public static int[] nextPerm(int[] num){
		int N = num.length;
		
		// gets to the index of the beginning of the tail and in front of the pivot
		int i = N-1;
		while(num[i-1]>=num[i])
			i--;
		
		// gets to the index of the smallest number in the tail that is greater than the pivot
		int j = N;
		while(num[j-1]<=num[i-1])
			j--;
		
		// swaps pivot and smallest number greater than pivot in tail
		num = swap(num,j-1,i-1);
		
		i++;
		j = N;
		
		while(i<j){
			swap(num,i-1,j-1);
			i++;
			j--;
		}
		return num;
	}
	
	public static int[] swap(int[] num, int a, int b){
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
		return num;
	}
	

}
