/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *break statement exiting a for statement.
 *User: Muh. Asrul Mulis
 *Date: 07/Maret/2023
 *
 *Version(0.7)
 */
 
 public class BreakTes {
     
	public static void main(String[] args ) {
	     
		int count; // control variable also used after loop terminates
		
		for(count = 1; count <=10; count++) { // loop 10 times
		       
			if(count == 5) { // if count is 5,
			     
                break; // terminate loop
			} // end if
			System.out.printf("%d ", count );
		} // end for
		System.out.printf("\nBroke out of loop at count = %d\n ", count );
	} // end main
 } // end class BreakTes