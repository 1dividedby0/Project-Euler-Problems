import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class problem18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] currentLineArray;
		String[] nextLineArray = {};
		for(int j = 14; j>=1; j--){
			if(j == 14){
				currentLineArray = getLineAtIndex(j).split("\\s+");
			}else{
				currentLineArray = nextLineArray;
			}
			nextLineArray = getLineAtIndex(j-1).split("\\s+");
			// minus two because we are going by pairs of two and also you always need to subtract one otherwise array out of bounds
			for(int i = 0; i<currentLineArray.length-1; i++){
				int firstNum = Integer.parseInt(currentLineArray[i]);
				int secondNum = Integer.parseInt(currentLineArray[i+1]);
				int greaterNum = firstNum > secondNum ? firstNum : secondNum;
				int sum = greaterNum + Integer.parseInt(nextLineArray[i]);
				nextLineArray[i] = Integer.toString(sum);
			}
		}
		System.out.println(nextLineArray[0]);
	}
	public static String getLineAtIndex(int i){
		try{
			BufferedReader r = new BufferedReader(new FileReader(new File("p067_triangle.txt")));
			for(int k = 0; k<i; k++){
				r.readLine();
			}
			String line = r.readLine();
			r.close();
			return line;
		} catch(IOException e){
			e.printStackTrace();
		}
		return "";
	}
}
