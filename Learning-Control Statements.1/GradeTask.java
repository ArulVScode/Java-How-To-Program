/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *GradeTask class that solves the class-average problem using sentinel-controlled repetition.
 *User: Muh. Asrul Mulis
 *Date: 27/February/2023
 *
 *Version(0.2)
 */

import java.util.Scanner;

public class GradeTask {
     
	private String courseName; // name of course this GradeTask represents
	// constructor initializes courseName
	public GradeTask(String name ) {
	     
		courseName = name; // initializes courseName
	} //end constructor
	// method to set the course name
	public void setCourseName(String name ) {
	     
		courseName = name; // store the course name
	} //end method setCourseName
	// method to retrieve the course name
	public String getCourseName() {
	     
		return courseName;
	} //end method getCourseName
	// display a welcome message to the GradeTask user
	public void displayMessage() {
	     // getCourseName gets the name of the course
		System.out.printf("Welcome to the Grade Task for\n%s!\n\n", 
		getCourseName() );
	} //end method displayMessage
	// determine the average of an arbitrary number of grades
	public void determineClassAverage() {
	     // create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int total; // sum of grades
		int gradeCounter; // number of grades entered
		int grade; // grade value
		double average; // number with decimal point for average
		// initialization phase
		total =0; // initialize total
		gradeCounter =0; // initialize loop counter
		
		System.out.print("Enter grade or -1 to quit: ");
		grade = input.nextInt();
		// loop until sentinel value read from user
		while(grade !=-1) {
		     
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; // increment counter
			// prompt for input and read next grade from user
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		} //end while
		// termination phase
        // if user entered at least one grade...
		if(gradeCounter !=0) {
		     // calculate average of all grades entered
			average = (double) total / gradeCounter;
			// display total and average (with two digits of precision)
			System.out.printf("\nTotal of the %d Grades Entered is %d\n", 
			gradeCounter, total );
			System.out.printf("Clas Average is %.2f\n", average );
		} // end if
		else { // no grades were entered, so output appropriate message
		     
			System.out.println("No Grades Were Entered");
		} //end else
	} //end metho displayMessage
} //end class GradeTask