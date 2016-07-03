
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class problem42 {
	static String[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		readFile();
		
		int numOfTriangularNumbers = 0;
		
		long start = System.currentTimeMillis();
		
		for(String str:arr){
			int sum = 0;
			char[] split = str.toCharArray();
			for(char character:split){
				sum+=getAlphabeticalPosition(character);
			}
			if(isTriangular(sum))
				numOfTriangularNumbers++;
				
		}
		System.out.println("There are " + numOfTriangularNumbers + " triangular words in this list.");
		
		long end = System.currentTimeMillis();
		
		System.out.println("It took me " + (end-start) + " milliseconds to realize this.");
	}

	public static int getAlphabeticalPosition(char c){
		if(c == '\"')
			return 0;
		return (int)c-(int)'A' + 1;
	}
	
	public static boolean isTriangular(int num){
		if(Math.sqrt(num) != Math.sqrt(num)%1){
			// if it is not a perfect square
			for(int i = 1; i<Math.sqrt(num*2); i++){
				if(i*i + i == num*2){
					// if an integer is the correct index for the number then it is triangular
					return true;
				}
			}
		}
		return false;
	}
	
	private static void readFile() {
		// TODO Auto-generated method stub
		try {
			arr = new Scanner(new File("p042_words.txt")).useDelimiter("\\Z").next().split(",");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
