/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *GradeBook class that contains a courseName instance variable and methods to set and get its value.
 *User: Muh. Asrul Mulis
 *Date: 25/February/2023
 *
 *Version(0.8)
 */

public class GradeBookWon {
     
	private String courseName; // course name for this GradeBook
	// method to set the course name
	public void setCourseName(String name) {
	      
		courseName = name; // store the course name
	} //end method setCourseName
	// method to retrieve the course name
	public String getCourseName() {
	     
		return courseName;
	} //end method getCourseName
	// display a welcome message to the GradeBook user
	public void displayMessage() {
	     // calls getCourseName to get the name of
        // the course this GradeBook represents
		System.out.printf("Welcome to the GradeBookWon for\n%s!\n", 
		getCourseName() );
	} //end method displayMessage
} //end class GradeBookWon