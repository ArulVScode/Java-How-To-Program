/*
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Roll a six-sided die 6,000,000 times. 
 *User: Muh. Asrul Mulis
 *Date: 09/Maret/2023
 *
 *Version(0.3)
 */

import java.util.Random;

public class RollDie {
      
	public static void main(String[] args ) {
	     
		Random randomNumbers = new Random(); // random number generator
		
		int Frequency1 = 0; // maintains count of 1s rolled
		int Frequency2 = 0; // count of 2s rolled
		int Frequency3 = 0; // count of 3s rolled
		int Frequency4 = 0; // count of 4s rolled
		int Frequency5 = 0; // count of 5s rolled
		int Frequency6 = 0; // count of 6s rolled
		
		int face; // most recently rolled value
		// tally counts for 6,000,000 rolls of a die
		for(int roll = 1; roll <=6000000; roll++) {
			 
			face = 1 + randomNumbers.nextInt( 6 ); // number from 1 to 6
			// determine roll value 1-6 and increment appropriate counter
			switch(face) {
				case 1:
				   ++Frequency1; // increment the 1s counter
				   break;
				case 2:
				   ++Frequency2; // increment the 2s counter
				   break;
				case 3:
				   ++Frequency3; // increment the 3s counter
				   break;
				case 4:
				   ++Frequency4; // increment the 4s counter
				   break;
				case 5:
				   ++Frequency5; // increment the 5s counter
				   break;
				case 6:
				   ++Frequency6; // increment the 6s counter
				   break; // optional at end of switch
			} // end switch
		} // end for
		
		System.out.println("Face\tFrequency"); // output headers
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", 
		Frequency1, Frequency2, Frequency3, Frequency4, Frequency5, Frequency6 );
	} // end main
} // end class RollDie