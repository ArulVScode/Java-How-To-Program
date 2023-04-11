/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Handling ArithmeticExceptions and InputMismatchExceptions.
 *
 *User: Muh. Asrul Mulis
 *Date: 11/April/2023
 *
 *Version(0.2)
 */
 import java.util.InputMismatchException;
 import java.util.Scanner;
 
public class DivideByZeroNoExceptionHandling2 {
     // demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient( int numerator, int denominator ) {
		 
		return numerator / denominator; // possible division by zero
	} // end method quotient
	
	public static void main(String[] args) {
		 // Scanner for input
		Scanner enter = new Scanner(System.in);
		 
		boolean continueLoop = true; // determines if more input is needed
		 
		do {
			 // read two numbers and calculate quotient
			try {
				 
				System.out.print("Please enter an integer numerator: ");
				int numerator = enter.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = enter.nextInt();
				 
				int result = quotient(numerator, denominator); 
				 
				System.out.printf( "\nResults: %d / %d = %d\n", numerator, denominator, result );
				 
				continueLoop = false; // input successful; end looping
			} // end try 
			catch(InputMismatchException inputMismatchException) {
				 
				System.err.printf( "\nException: %s\n", inputMismatchException );
				 // discard input so user can try again
				enter.nextLine();
				 
				System.out.println("You must enter integers. Please try again.\n");
			} // end catch
			catch(ArithmeticException arithmeticException) {
				 
				System.err.printf( "\nException: %s\n", arithmeticException );
				 
				System.out.println("Zero is an invalid denominator. Please try again.\n");
			} // end catch
		} // end do
		while(continueLoop); // while
	} // end main
} // end class DivideByZeroNoExceptionHandling2