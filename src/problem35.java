import java.util.ArrayList;
import java.util.Iterator;


public class problem35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isCircularPrime(11));
		
		ArrayList<Integer> allPerms = new ArrayList<Integer>();
		allPerms.add(2);
		allPerms.add(3);
		allPerms.add(5);
		allPerms.add(7);
		for(int i = 2; i<=6; i++){
			allPerms.addAll(findPerms(new ArrayList<Integer>(),i,0, new int[]{1,3,7,9}));
		}
		
		Iterator<Integer> iter = allPerms.iterator();
		while(iter.hasNext()){
			int i = iter.next();
			if(!isCircularPrime(i)){
				iter.remove();
			}
		}
		System.out.println(allPerms.size()); 
		
	}
	
	public static boolean isCircularPrime(int x){
		char[] str = Integer.toString(x).toCharArray();
		
		for(int j = 0; j<str.length; j++){
			int prime = Integer.parseInt(new String(str));
			//System.out.println(prime);
			if(!isPrime(prime)){
				return false;
			}
			char start = str[0];
			for(int i = 0; i<str.length; i++){
				if(i == str.length-1){
					str[i] = start;
				}else{
					str[i] = str[i+1];
				}
			}
			
		}
		return true;
	}
	
	public static boolean isPrime(int x){
		for(int i = 2; i<x/2; i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> findPerms(ArrayList<Integer> list, int size, int num, int[] numbers){
		if(Integer.toString(num).length() >= size){
			list.add(num);
		}else{
			for(int i:numbers){
				findPerms(list, size, Integer.parseInt(Integer.toString(num) + Integer.toString(i)), numbers);
			}
		}
		return list;
	}
	
}
