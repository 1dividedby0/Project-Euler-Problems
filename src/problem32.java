import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;


public class problem32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 100; i<=2000; i++){
			
			char[] iArr = Integer.toString(i).toCharArray();
			
			ArrayList<Character> iList = new ArrayList<Character>();
			for (char c : iArr) {
		        iList.add(c);
		    }
			loop: for(int j = 2; j<100; j++){
				char[] jArr = Integer.toString(j).toCharArray();
				
				int product = i*j;
				
				char[] productArr = Integer.toString(product).toCharArray();
				ArrayList<Character> jList = new ArrayList<Character>();
				for (char c : jArr) {
			        jList.add(c);
			    }
				
				ArrayList<Character> productList = new ArrayList<Character>();
				for (char c : productArr) {
			        productList.add(c);
			    }
				
				for(char c:productArr){
					if(jList.contains(c) || iList.contains(c) || Collections.frequency(productList, c) > 1 || c == '0'){
						continue loop;
					}
				}
				for(char c:jList){
					if(iList.contains(c) || Collections.frequency(jList, c) > 1 || c == '0')
						continue loop;
				}
				
				for(char c:iList){
					if(Collections.frequency(iList, c) > 1 || c == '0'){
						continue loop;
					}
				}
				if((iArr.length + jArr.length + productArr.length) != 9){
					continue;
				}
					
				set.add(product);
			}
		}
		long end = System.currentTimeMillis();
		int sum = 0;
		for(int i:set)
			sum+=i;
		System.out.println("The sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital is...");
		System.out.println(sum + " with " + set.size() + " products.");
		System.out.println("This solution took: " + (end-start) + " milliseconds.");
	}

}
