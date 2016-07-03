
public class problem19 {
	private static int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static int year = 1901;
	public static int weekDay = 2;
	public static int numOfSundays = 0;
	public static void main(String[] args){
		for(int j = year; j<=2000; j++){
			for(int i = 0; i< 12; i++){
				int numOfDays = months[i];
				// if it is the fine month of February and it is a leap year
				if(i == 1 && (j%4 == 0 || j%400 == 0)){	
					numOfDays = 29;
				}
				/* * 
			 	* set the next month's first weekDay (i.e. Sunday, Tuesday, Wednesday, Thursday)
			 	* add the rest of the days in the month to the weekDay
			 	* find the day of the week that the month ends on
			 	* add one to it in order to find the next month's beginning day of the week 
			 	* */
				weekDay = (weekDay + numOfDays)%7;
				if(weekDay == 0){
					numOfSundays++;
				}
			}
		}
		System.out.println(numOfSundays);
	}
}
