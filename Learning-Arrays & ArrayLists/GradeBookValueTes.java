/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *GradeBookValueTest creates GradeBook object using a two-dimensional array
  of grades, then invokes method processGrades to analyze them.
 *User: Muh. Asrul Mulis
 *Date: 24/Maret/2023
 *
 *Version(2.13)
 */
public class GradeBookValueTes {
      // main method begins program execution
	public static void main(String[] args ) {
	      // two-dimensional array of student grades
		int[][] gradesArray = {{ 87, 96, 70 },
		                      { 68, 87, 90 }, 
						      { 94, 100, 90 }, 
						      { 100, 81, 82 }, 
						      { 83, 65, 85 }, 
						      { 78, 87, 65 }, 
						      { 85, 75, 83 }, 
						      { 91, 94, 100 }, 
						      { 76, 72, 84 }, 
						      {87, 93, 73 } };
		GradeBookValue myGradeBookValue = new GradeBookValue("CS101 Introduction to Java Programming", 
		gradesArray );
		myGradeBookValue.displayMessage();
		myGradeBookValue.processGrades();
	} // end main
} // end class GradeBookValueTes