/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Counter-controlled repetition with the while repetition statement.
 *
 *User: Muh. Asrul Mulis
 *Date: 04/Maret/2023
 *
 *Version(0.1)
 */

public class WhileCounter {
      
	public static void main(String[] args) {
	       
		int counter = 1; // declare and initialize control variable
		
		while(counter <=10) { // loop-continuation condition
		     
			System.out.printf("%d ", counter );  
			++counter; // increment control variable by 1
		} // end while
		System.out.println(); //output a new line
	} // end main
} // end class WhileCounter