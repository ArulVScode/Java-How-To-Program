/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Programmer-declared method maximum with three double parameters.
 *User: Muh. Asrul Mulis
 *Date: 09/Maret/2023
 *
 *Version(0.1)
 */

import java.util.Scanner;

public class MaximumFinder {
     // obtain three floating-point values and locate the maximum value
	public static void main(String[] args ) {
	     // create Scanner for input from command window
		Scanner enter = new Scanner(System.in);
		// prompt for and input three floating-point values
		System.out.print("Enter three floating-point values separated by spaces: \n");
		double number1 = enter.nextDouble(); // read first double
		double number2 = enter.nextDouble(); // read second double
		double number3 = enter.nextDouble(); // read third double
		// determine the maximum value
		double results = maximum(number1, number2, number3);
		// display maximum value
		System.out.println("Maximum is Results: " + results );
	} // end main
	// returns the maximum of its three double parameters
	public static double maximum(double x, double y, double z) {
	     
		double maximumValue = x; // assume x is the largest to start
		// determine whether y is greater than maximumValue
		if(y > maximumValue) {
		     
			maximumValue = y;
		} // end if MaximumValue Y
		// determine whether z is greater than maximumValue
		if(z > maximumValue) {
		     
			maximumValue = z;
		} // end MaximumValue Z
		
		return maximumValue;
	} // end main MaximumValue
} // end class MaximumFinder