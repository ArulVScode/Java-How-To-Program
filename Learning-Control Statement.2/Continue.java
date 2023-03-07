/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *continue statement terminating an iteration of a for statement.
 *User: Muh. Asrul Mulis
 *Date: 07/Maret/2023
 *
 *Version(0.8)
 */
 
 public class Continue {
     
	public static void main(String[] args ) {
	     
		for(int count =1; count <=10; count++) { // loop 10 times
		     
			if(count ==5) { // if count is 5,
			     
				continue; // skip remaining code in loop
			} // end if
			System.out.printf("%d ", count);
		} // end for
		System.out.printf("\nUsed to Continue to skip Printing: 5\n");
	} // end main
 } // end class Continue