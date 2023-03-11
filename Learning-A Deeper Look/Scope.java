/*
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Scope class demonstrates field and local variable scopes.
 *User: Muh. Asrul Mulis
 *Date: 11/Maret/2023
 *
 *Version(0.5)
 */

public class Scope {
     // field that is accessible to all methods of this class
	private static int x = 1;
	// method main creates and initializes local variable x
    // and calls methods useLocalVariable and useField
	public static void main(String[] args ) {
	     
		int x =5; // method's local variable x shadows field x
		
		System.out.printf("Local x in My is %d\n", x );
		
		useLocalVariable(); // useLocalVariable has local x
		useFailed(); // useField uses class Scope's field x
		useLocalVariable(); // useLocalVariable reinitializes local x
		useFailed(); // class Scope's field x retains its value
		
		System.out.printf("\nLocal x in My is %d\n", x );
	} // end main
	// create and initialize local variable x during each call
	public static void useLocalVariable() {
	     
		int x = 25; // initialized each time useLocalVariable is called
		
		System.out.printf("\nLocal x on Entering Method useLocalVariable is %d\n", x );
		++x; // modifies this method's local variable x
		System.out.printf("Local x Before Exiting Method useLocalVariable is %d\n", x );
	} // end method useLocalVariable
	// modify class Scope's field x during each call
	public static void useFailed() {
	     
		System.out.printf("\nFailed x on Entering Method useFailed is %d\n", x );
		x *= 10; // modifies class Scope's field x
		System.out.printf("Failed x Before Exiting Method useFailed is %d\n", x );
	} // end method useFailed
} // end class Scope