import java.lang.Math;
public class problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add = 2;
	    int sum = 1;
	    int sumDivisorCount = 0;
	    while(true){
	      sum+=add;
	      add++;
	      int sqrt = (int) Math.sqrt(sum);
	      
	      for(int i = 1; i <= sqrt; i++){
	        if(sum%i == 0){
	          sumDivisorCount+=2;
	        }
	      }
	      if(sqrt * sqrt == sum){
	    	  sumDivisorCount--;
	      }
	      //System.out.println(sum);
	      if(sumDivisorCount>5){
	        break;
	      }
	      sumDivisorCount = 0;
	    }
	    System.out.println(sum);
	}

}
