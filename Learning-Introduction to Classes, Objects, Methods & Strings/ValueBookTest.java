/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Creating and manipulating a ValueBook object.
 *User: Muh. Asrul Mulis
 *Date: 23/February/2023
 *
 *Version(0.3)
 */

import java.util.Scanner;

public class ValueBookTest {
    // main method begins program execution
	public static void main(String[] args) {
	     // create Scanner to obtain input from command window
		Scanner test = new Scanner(System.in);
		// create a GradeBook object and assign it to myGradeBook
		ValueBook myValueBook = new ValueBook();
		
		// display initial value of courseName
		System.out.printf("Initial course Name is: %s\n\n", 
		myValueBook.getCourseName() );
		
		// prompt for and read course name
		System.out.printf("Please Enter the course Name: ");
		String theName = test.nextLine();
		myValueBook.setCourseName( theName );
		
		System.out.println();
		
		// display welcome message after specifying course name
		myValueBook.displayMessage();
	} //end main
} //end calss ValueBook