import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// logarithms: exponential rule
public class problem99 {
	static String[] arr = {};
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		readFile();
		int counter = 1;
		int maxLine = 0;
		int max = 0;
		for(String i:arr){
			String[] split = i.split(",");
			int base = Integer.parseInt(split[0]);
			int exp = Integer.parseInt(split[1]);
			int product = (int) (Math.log(base) * exp);
			if(product>max){
				max = product;
				maxLine = counter;
			}
			counter++;
		}
		long end = System.currentTimeMillis();
		System.out.println("The greatest base/exponent pair is at line " + maxLine + ".");
		System.out.println("This solution took " + (end-start) + " milliseconds");
	}
	
	private static void readFile() {
		// TODO Auto-generated method stub
		try {
			ArrayList<String> list = new ArrayList<String>();
			Scanner scan = new Scanner(new File("p099_base_exp.txt"));
			while(scan.hasNextLine()){
				list.add(scan.nextLine());
			}
			arr = list.toArray(new String[0]);
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
