/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Prefix increment and postfix increment operators.
 *User: Muh. Asrul Mulis
 *Date: 02/Maret/2023
 *
 *Version(0.4)
 */

public class Increment {
      
	public static void main(String[] args) {
	      
		int c;
		  // demonstrate postfix increment operator
		c =5; // assign 5 to c
		System.out.println( c ); // prints 5
		System.out.println( c++ ); // prints 5 then postincrements
		System.out.println( c ); // prints 6
		
		System.out.println();
		
		c =5;
		System.out.println( c ); // prints 5
		System.out.println( ++c ); // prints 6 then postincrements
		System.out.println( c ); // prints 6
	} // end main
} //end class Increment