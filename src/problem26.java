
import java.util.ArrayList;


public class problem26 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int max = 0;
		int answer = 0;
		for(int i = 5; i<1000; i++){
			int len = getRecurringDecimalLength(i);
			if(len>max){
				max = len;
				answer = i;
			}
		}
		System.out.println(answer);
		
	}
	
	public static int getRecurringDecimalLength(int d){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 1;
		while(true){
			if(list.contains((num%d)*10) || num%d == 0)
				break;
			num = (num%d)*10;
			list.add(num);
		}
		return list.size();
	}
	
}
