/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Create Analysis object
 *User: Muh. Asrul Mulis
 *Date: 01/Maret/2023
 *
 *Version(0.3)
 */

import java.util.Scanner;

public class Analysis {
     
	public static void main(String[] args) {
	      // create Scanner to obtain input from command window
		Scanner enter = new Scanner(System.in);
		// initializing variables in declarations
		int passes =0; // number of passes
		int failures =0; // number of failures
		int studentCounter =1; // number of studentCounter
		int result; // one exam result (obtains value from user)
		// process 10 students using counter-controlled loop
		while(studentCounter <= 10) {
		     // prompt user for input and obtain value from user
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			result = enter.nextInt();
			// if...else is nested in the while statement
			if(result == 1) // if result 1,
			  passes = passes + 1; // increment passes;
			else  // else result is not 1, so
			  failures = failures + 1; //increment failures
			
			studentCounter = studentCounter + 1;
		} // end while
		// termination phase; prepare and display results
		System.out.printf("Passed: %d\n failed: %d\n", passes, failures );
		// determine whether more than 8 students passed
		if(passes > 8)
		  System.out.println("Bonus to Instructor!");
	} // end main
} // end class Analysis