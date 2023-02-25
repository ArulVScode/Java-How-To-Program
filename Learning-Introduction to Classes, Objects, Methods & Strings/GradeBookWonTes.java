/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Creating and manipulating a GradeBook object.
 *User: Muh. Asrul Mulis
 *Date: 25/February/2023
 *
 *Version(0.8)
 */

import java.util.Scanner;

public class GradeBookWonTes {
     // main method begins program execution
	public static void main(String[] args) {
	      // create Scanner to obtain input from command window
		Scanner enter = new Scanner(System.in);
		// create a GradeBook object and assign it to myGradeBook
		GradeBookWon myGradeBookWon = new GradeBookWon();
		System.out.printf("Initial Course Name is: %s\n\n", 
		myGradeBookWon.getCourseName() ); // display initial value of courseName
		// prompt for and read course name
		System.out.print("Please Enter the Course Name: ");
		String theName = enter.nextLine(); // read a line of text
		myGradeBookWon.setCourseName(theName); // set the course name
		
		System.out.println(); // outputs a blank line
		// display welcome message after specifying course name
		myGradeBookWon.displayMessage(); 
	} //end main
} //end class GradeBookWonTes