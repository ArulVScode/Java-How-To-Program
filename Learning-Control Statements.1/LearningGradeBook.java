/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *LearningGradeBook class that solves class-average problem using counter-controlled repetition.
 *User: Muh. Asrul Mulis
 *Date: 25/February/2023
 *
 *Version(0.1)
 */

import java.util.Scanner; // program uses class Scanner

public class LearningGradeBook {
      
	private String courseName; // name of course this GradeBook represents
	 // constructor initializes courseName
	public LearningGradeBook(String name) {
		     
		courseName = name; // initializes courseName
	} //end constructor
	// method to set the course name
	public void setCourseName(String name) {
		     
		courseName = name;
	} //end method setCourseName
	// display a welcome message to the GradeBook user
	public String getCourseName() {
		     
		return courseName;
	} //end method getCourseName
	// display a welcome message to the GradeBook user
	public void displayMessage() {
		 // getCourseName gets the name of the course
		System.out.printf("Welcome to the Grade Book for\n%s!\n\n", 
		getCourseName() );
	} //end method displayMessage
	// determine class average based on 10 grades entered by user
	public void determineClassAverage() {
		 // create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		int total; // sum of grades entered by user
		int gradeCounter; // number of the grade to be entered next
		int grade; // grade value entered by user
		int average; // average of grades
		// initialization phase
		total = 0;
		gradeCounter = 1;
		// processing phase uses counter-controlled repetition
		while(gradeCounter <= 10) { // loop 10 times
			     
			System.out.print("Enter Grade: ");
			grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1; // increment counter by 1
		} //end while
		// termination phase
		average = total / 10; // integer division yields integer result
		// display total and average of grades
		System.out.printf("\nTotal of all 10 grades in is %d\n", total );
		System.out.printf("Class Average is %d\n", average );
	} // end method determineClassAverage
} //end class LearningGradeBook