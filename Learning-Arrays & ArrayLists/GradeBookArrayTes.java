/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *GradeBookArrayTest creates a GradeBookArray object using an array of grades,
  then invokes method processGrades to analyze them.
 *User: Muh. Asrul Mulis
 *Date: 22/Maret/2023
 *
 *Version(2.11)
 */
 
 public class GradeBookArrayTes {
      // main method begins program execution
    public static void main(String[] args ) {
	     // array of student grades
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		 
		GradeBookArray myGradeBookArray = new GradeBookArray("CS101 Introduction to Java Programming", 
		gradesArray );
		 
		myGradeBookArray.displayMessage();
		 
		myGradeBookArray.processGrades();
	} // end main
 } // end class GradeBookArrayTes