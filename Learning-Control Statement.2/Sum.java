/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Summing integers with the for statement.
 *
 *User: Muh. Asrul Mulis
 *Date: 04/Maret/2023
 *
 *Version(0.3)
 */

public class Sum {
     
	public static void main(String[] args) {
	      
		int total = 0; // initialize total
		// total even integers from 2 through 20
		for(int number = 2; number <= 20; number += 2) {
		     
			total += number;
		     
			System.out.printf("Sum is: %d\n ", total ); // display results
			
		} // end for
	} // end main
} // end class Sum