/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Date class declaration.
 *User: Muh. Asrul Mulis
 *Date: 31/Maret/2023
 *
 *Version(1.04)
 */

public class Date {
     
	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // any year
	 
	private static final int[] daysPerMonth =  // days in each month
	     
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	// constructor: call checkMonth to confirm proper value for month;
    // call checkDay to confirm proper value for day
	public Date( int theMonth, int theDay, int theYear ) {
	      
		month = checkMonth(theMonth); // validate month
		year = theYear; // could validate year
		day = checkDay(theDay); // validate day
		 
		System.out.printf("Data object constructor for date %s\n", this );
	} // end Data constructor
	// utility method to confirm proper month value
	private int checkMonth( int tesMonth ) {
	      
		if(tesMonth > 0 && tesMonth <= 12)  // validate month
		     
			return tesMonth;
		else // month is invalid
		     
			throw new IllegalArgumentException("month must be 1-12");
	} // end method checkMonth
	// utility method to confirm proper day value based on month and year
	private int checkDay(int tesDay) {
	     // check if day in range for month
		if(tesDay > 0 && tesDay <= daysPerMonth[ month ]) 
		      
			return tesDay;
			 
		 // check for leap year
		if(month == 2 && tesDay == 29 && (year % 400 == 0 || 
		     
			(year % 4 == 0 && year % 100 != 0) ) )
		      
			return tesDay;
		      
		throw new IllegalArgumentException
		     
			("day out-of-range for the specified month and year");
	} // end method checkDay
	// return a String of the form month/day/year
	public String toString() {
	      
		return String.format("%d/%d/%d", month, day, year );
	} // end method toString
} // end class Date