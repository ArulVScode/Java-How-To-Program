/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *LearningBook constructor used to specify the course name at the time each LearningBook object is created.
 *User: Muh. Asrul Mulis
 *Date: 24/February/2023
 *
 *Version(0.3)
 */

public class LearningBookTest {
     // main method begins program execution
	public static void main(String[] args) {
	    // create LearningBook object
		LearningBook learningBook1 = new LearningBook("CS101 Introduction to Java Programming");
		LearningBook learningBook2 = new LearningBook("CS102 Data Structures in Java");
		// display initial value of courseName for each GradeBook
		System.out.printf("learningBook1 course name is: %s\n",
		learningBook1.getCourseName() );
		System.out.printf("learningBook2 course name is: %s\n", 
		learningBook2.getCourseName() );
	} //end method 
} //end class LearningBook