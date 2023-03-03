/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Calculate the sum of the integers from 1 to 10
 *User: Muh. Asrul Mulis
 *Date: 03/Maret/2023
 *
 *Version(0.6)
 */

public class Calculate {
     
	public static void main(String[] args) {
	       
		int sum;
		int x;
		
		x = 1; // initialize x to 1 for counting
		sum = 0; // initialize sum to 0 for totaling
		
		while( x <= 10 ) { // while x is less than or equal to 10
		     
			sum += x; // add x to sum
			++x; // increment x
		} // end while
		
		System.out.printf("The sum is: %d\n", sum );
	} // end main
} // end class Calculate