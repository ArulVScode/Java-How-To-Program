/*
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Shifted and scaled random integers.
 *User: Muh. Asrul Mulis
 *Date: 09/Maret/2023
 *
 *Version(0.1)
 */

import java.util.Random;

public class RandomIntegers {
     
	public static void main(String[] args ) {
	      
		Random randomNumbers = new Random(); // random number generator
		
		int face; // stores each random integer generated
		// loop 20 times
		for(int counter = 1; counter <= 10; counter++) {
		      // pick random integer from 1 to 6
			face = 1 + randomNumbers.nextInt( 6 );
			
			System.out.printf("%d ", face ); // display generated value
			// if counter is divisible by 5, start a new line of output
			if(counter %5 == 0) {
			     
				System.out.println();
			} // end if
		} // end for
	} // end main
} // end class RandomIntegers