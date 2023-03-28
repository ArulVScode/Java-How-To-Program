/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Time1 object used in an application.
 *User: Muh. Asrul Mulis
 *Date: 28/Maret/2023
 *
 *Version(2.01)
 */
 
public class  Time1Tes {
     
	public static void main(String[] args ) {
	     // create and initialize a Time1 object
		Time1 time = new Time1(); // invokes Time1 constructor
		 // output string representations of the time
		System.out.print("The Initial Universal time is: ");
		System.out.println( time.toUniversalString() );
		System.out.print("The initial standar time is: ");
		System.out.println( time.toString() );
		System.out.println(); // output a blank line
         // change time and output updated time
		time.setTime( 13, 27, 6 );
		System.out.print("Universal time after setTime is: ");
		System.out.println( time.toUniversalString() );
		System.out.print("Standard time after setTime is: ");
		System.out.println( time.toString() );
		System.out.println(); // output a blank line
		 // attempt to set time with invalid values
		try {
		     
			time.setTime( 99, 99, 99 ); // all values out of range
		} // end try
		catch(IllegalArgumentException e) {
		      
			System.out.printf("Exception: %s\n\n", e.getMessage() );
		} // end catch
		// display time after attempt to set invalid values
		System.out.println("After attempting invalid settings:");
		System.out.print("Universal time: ");
		System.out.println( time.toUniversalString() );
		System.out.print("Standard time: ");
		System.out.println( time.toString() );
	} // end main
} // end class Time1Tes