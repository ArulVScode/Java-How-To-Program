/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Create LearningGradeBook object and invoke its determineClassAverage method.
 *User: Muh. Asrul Mulis
 *Date: 25/February/2023
 *
 *Version(0.6)
 */

public class LearningGradeBookTest {
     
	public static void main(String[] args) {
	     // create GradeBook object myGradeBook and
         // pass course name to constructor
		LearningGradeBook myLearningGradeBook = new LearningGradeBook("CS101 Introduction to Java Programming");
		
		myLearningGradeBook.displayMessage(); // display welcome message
		myLearningGradeBook.determineClassAverage(); // find average of 10 grades
	} //end main
} //end class LearningGradeBookTest