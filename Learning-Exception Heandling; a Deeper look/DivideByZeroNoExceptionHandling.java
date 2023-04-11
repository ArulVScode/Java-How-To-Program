/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Integer division without exception handling.
 *
 *User: Muh. Asrul Mulis
 *Date: 11/April/2023
 *
 *Version(0.1)
 */
import java.util.Scanner;
 
public class DivideByZeroNoExceptionHandling {
	 // demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient( int numerator, int denominator ) {
		 
		return numerator / denominator;
	} // end method quotient
    
	public static void main(String[] args) {
	     // scanner for input
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Please enter an integer numerator: ");
		int numerator = input.nextInt();
		System.out.print("Please enter an integer denominator: ");
		int denominator = input.nextInt();
		 
		int result = quotient(numerator, denominator);
		 
		System.out.printf( "\nResult: %d / %d = %d\n", numerator, denominator, result );
	} // end main
} // end class DivideByZeroNoExceptionHandling