/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Create GradeBook object and pass a String to, its displayMessage method.
 *User: Muh. Asrul Mulis
 *Date: 23/February/2023
 *
 *Version(0.2)
 */

import java.util.Scanner; // program uses Scanner

public class MaterialValuesTest {
     // main method begins program execution
	public static void main(String[] args) {
		
		// main method begins program execution
	    Scanner value = new Scanner(System.in);
		
		// create a GradeBook object and assign it to myGradeBook
		MaterialValues myMaterialValues = new MaterialValues();
		
		System.out.println("Please Enter the Course Name: ");
		String nameOfCourse = value.nextLine();
		System.out.println();
		
		// call myGradeBook's displayMessage method
       // and pass nameOfCourse as an argument
		myMaterialValues.displayMessage( nameOfCourse );
	} //end method
} //end class MaterialValuesTest