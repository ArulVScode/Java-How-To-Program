/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Screen.java Represents the screen of the ATM
 *User: Muh. Asrul Mulis
 *Date: 01/Mei/2023
 *
 *Version(0.3)
 */

public class Screen {
     // display a message without a carriage return
	public void displayMessage( String message ) {
		 
		System.out.print( message );
	} // end method displayMessage
	// display a message with a carriage return
	public void displayMessageLine( String message ) {
		 
		System.out.println( message );
	} // end method displayMessageLine
	// displays a dollar amount
	public void displayDollarAmount( double amount ) {
		 
		System.out.printf("$%,.2f", amount );
	} // end method displayDollarAmount
} // end class Screen