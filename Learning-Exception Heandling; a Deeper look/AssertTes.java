/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Checking with assert that a value is within range.
 *
 *User: Muh. Asrul Mulis
 *Date: 14/April/2023
 *
 *Version(0.6)
 */
import java.util.Scanner;

public class AssertTes {
     
	public static void main(String[] args) {
	     
		Scanner enter = new Scanner(System.in);
		 
		System.out.print("Enter a number between 0 and 10: ");
		int number = enter.nextInt();
		 // assert that the value is >= 0 and <= 10
		assert ( number >= 0 && number <= 10 ) : "bad number: " + number;
		 
		System.out.printf( "You entered %d\n", number );
	} // end main
} // end class AssertTes