/*
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Overloaded method declarations.
 *User: Muh. Asrul Mulis
 *Date: 13/Maret/2023
 *
 *Version(0.6)
 */

public class MethodOverload {
     // test overloaded square methods
	public static void main(String[] args ) {
	      
		System.out.printf("Square of Integer 7 is %d\n", square(7) );
		System.out.printf("Square of Double 7.5 is %f\n", square(7.5) );
	} // end main
	// square method with int argument
	public static int square(int intValue) {
	     
		System.out.printf("\nCalled Square with Int Arguments: %d\n", 
		intValue );
		
		return intValue * intValue;
	} // end method square with int argument
	
	public static double square(double doubleValue) {
	      
		System.out.printf("\nCalled Square with Double Arguments: %f\n", 
		doubleValue );
		
		return doubleValue * doubleValue;
	} // end method square with double argument
} // end class MethodOverload