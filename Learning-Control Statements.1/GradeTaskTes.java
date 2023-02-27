/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Create GradeTask object and invoke its determineClassAverage method.
 *User: Muh. Asrul Mulis
 *Date: 27/February/2023
 *
 *Version(0.2)
 */

public class GradeTaskTes {
      
	public static void main(String[] args) {
	     // create GradeTask object myGradeTask and
         // pass course name to constructor
		GradeTask myGradeTask = new GradeTask("CS101 Introduction to Java Programming");
		
		myGradeTask.displayMessage(); // display welcome message
		myGradeTask.determineClassAverage(); // find average of grades
	} //end main
} //end class GradeTaskTes