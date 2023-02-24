/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *LearningBook class with a constructor to initialize the course name.
 *User: Muh. Asrul Mulis
 *Date: 24/February/2023
 *
 *Version(0.3)
 */

public class LearningBook {
    
	private String courseName; //course name for this LearningBook
	// constructor initializes courseName with String argument
    public LearningBook(String name ) { // constructor name is class name
	    
		courseName = name; // initializes courseName
	} // end constructor
	// method to set the course name
	public void setCourseName(String name ) {
	    
		courseName = name; // store the course name
	} // end method setCourseName
	// method to retrieve the course name
	public String getCourseName() {
		
	    return courseName;
	}// end method getCourseName
	// this statement calls getCourseName to get the
   // name of the course this GradeBook represents
	public void displayMessage() {
	    
		System.out.printf("Welcome to the LearningBook for\n%s!\n",
		getCourseName() );
	} //end method displayMessage
} //end class LearningBook