/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *ValueBook class that contains a courseName instance variable and methods to set and get its value.
 *User: Muh. Asrul Mulis
 *Date: 23/February/2023
 *
 *Version(0.3)
 */

public class ValueBook {
   
    private String courseName; // course name for this ValueBook
	// method to set the course name
	public void setCourseName(String name) {
	    
		courseName = name; // store the course name
	} //end method setCourseName
	
	// method to retrieve the course name
	public String getCourseName() {
	     
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook user
	public void displayMessage() {
	     
		System.out.printf("Welcome to the GradeBook for\n%s!\n", 
		getCourseName() );
	} //end method displayMessage
} //end class ValueBook