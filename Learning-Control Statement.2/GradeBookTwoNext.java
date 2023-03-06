/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Create GradeBook object, input grades and display grade report.
 *User: Muh. Asrul Mulis
 *Date: 06/Maret/2023
 *
 *Version(0.6)
 */

public class GradeBookTwoNext {
      
	public static void main(String[] args ) {
	     // create GradeBook object myGradeBook and
         // pass course name to constructor
		GradeBookTwo myGradeBookTwo =  new GradeBookTwo("CS101 Introduction to Java Programming");
		
		myGradeBookTwo.displayMessage(); // display welcome message
		myGradeBookTwo.inputGrades(); // read grades from user
		myGradeBookTwo.displayGradeReport(); // display report based on grades
	} // end main
} // end class GradeBookTwoNext