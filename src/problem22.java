import java.util.Arrays;


public class problem22 {
	static String[] names = {"INSERT", "NAMES", "HERE"};
	static char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	static int total = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.sort(names);
		for(int pos = 0; pos<names.length; pos++){
			int alphabetValue = 0;
			char[] letters = names[pos].toCharArray();
			for(char letter: letters){
				//obtain numerical position of letter in alphabet
				int letterPosition = new String(alphabet).indexOf(letter)+1;
				alphabetValue+= letterPosition;
			}
			//add +1 to the end of this equation if the name positions in the names array start at 1 not 0
			total += alphabetValue*(pos+1);
		}
		System.out.println(total);
	}

}
