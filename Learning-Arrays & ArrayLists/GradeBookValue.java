/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *GradeBookValue class using a two-dimensional array to store grades.
 *User: Muh. Asrul Mulis
 *Date: 24/Maret/2023
 *
 *Version(1.13)
 */

public class GradeBookValue {
     
	private String courseName; // name of course this grade book array represents
	private int[][] grades; // two-dimensional array of student grades
	 // two-argument constructor initializes courseName and grades array
	public GradeBookValue(String name, int[][] gradesArray) {
	       
		courseName = name; // initialize courseName
		grades = gradesArray; // store grades
	} // end two-argument GradeBook constructor
	 // method to set the course name
	public void setCourseName(String name) {
	     
		courseName = name; // store the course name
	} // end method setCouseName
	 // method to retrieve the course name
	public String getCourseName() {
	     
		return courseName;
	} // end method getCourseName
	 // display a welcome message to the GradeBookValue user
	public void displayMessage() {
	     // getCourseName gets the name of the course
		System.out.printf("Welcome to the grade book value for \n%s!\n\n", 
		getCourseName() );
	} // end method displayMessage
	 // perform various operations on the data
	public void processGrades() {
	     // output grades array
		outputGrades();
		     // call methods getMinimum and getMaximum
			System.out.printf("\n%s %d\n%s %d\n\n", 
			"Lowes grade in the grade book value is", getMinimum(),  
			"Highest grade in the grade book value is", getMaximum() );
			 // output grade distribution chart of all grades on all tests
		outputBarChart();
	} // end method processGrades
	 // find minimum grade
	public int getMinimum() {
	     // assume first element of grades array is smallest
		int lowGrade = grades[0][0];
		 // loop through rows of grades array
		for(int[] studentGrades : grades) {
		     // loop through columns of current row
			for(int grade : studentGrades) {
			     // if grade less than lowGrade, assign it to lowGrade
				if(grade < lowGrade)
				     
				    lowGrade = grade; 
			} // end inner for
		} // end outer for
		return lowGrade; // return lowest grade
	} // end method getMinimum
	 // find maximum grade
	public int getMaximum() {
	     // assume first element of grades array is largest
		int highGrade = grades[0][0];
		 // loop through rows of grades array
		for(int[] studentGrades : grades) {
		     // loop through columns of current row
			for(int grade : studentGrades) {
			     // if grade greater than highGrade, assign it to highGrade
				if(grade > highGrade)
				     
				highGrade = grade;
			} // end inner for
		} // end outer for
		return highGrade; // return highest grade
	} // end method getMaximum
	 // determine average grade for particular set of grades
	public double getAverage(int[] setOfGrades) {
	       
		int total =0; // initialize total
		 // sum grades for one student
		for(int grade : setOfGrades) 
		     
			total += grade;
		// return average of grades	 
		return (double) total / setOfGrades.length;
	} // end method getAverage
	// output bar chart displaying overall grade distribution
	public void outputBarChart() {
	      
		System.out.println("Overal grade distribution:");
		 // stores frequency of grades in each range of 10 grades
		int[] frequency = new int[11];
		 // for each grade in GradeBook, increment the appropriate frequency
		for(int[] studentGrades : grades) {
		     
			for(int grade : studentGrades)
			     
				++frequency[grade / 10];
		} // end outer for
		// for each grade frequency, print bar in chart
		for(int count = 0; count < frequency.length; count++) {
		       // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
			if(count == 10) 
			     
				System.out.printf(" %5d: ", 100 );
			else 
			     
				System.out.printf(" %02d-%02d: ", 
				count * 10, count * 10 + 9 );
			// print bar of asterisks	 
		    for(int stars = 0; stars < frequency[count]; stars++) 
			      
				System.out.print("*"); 
                 
			System.out.println(); // start a new line of output
		} // end outer for
	} // end method outputBarChart
	// output the contents of the grades array
	public void outputGrades() {
	      
		System.out.println("The grades are:\n ");
		 // align column heads
		System.out.print(" 	 	");
		 // create a column heading for each of the tests
		for(int tes = 0; tes < grades[0].length; tes++) 
		     
			System.out.printf("Tes %d  ", tes + 1 );
			 
		System.out.println("Average"); // student average column heading
		  // create rows/columns of text representing array grades
		for(int student = 0; student < grades.length; student++) {
		     
			System.out.printf("Student %2d ", student + 1 );
			 
			for(int tes : grades[student]) // output student's grades
			     
				System.out.printf("%8d", tes );
			 // call method getAverage to calculate student's average grade;
             // pass row of grades as the argument to getAverage
			double average = getAverage( grades[student] );
			    
			System.out.printf("%9.2f\n", average );
		} // end outer for
	} // end method outputGrades
} // end class GradeBookValue