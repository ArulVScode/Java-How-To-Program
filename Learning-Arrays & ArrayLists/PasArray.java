/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Passing arrays and individual array elements to methods.
 *User: Muh. Asrul Mulis
 *Date: 21/Maret/2023
 *
 *Version(0.10)
 */

public class PasArray {
      // main creates array and calls modifyArray and modifyElement
	public static void main(String[] args) {
	      
		int[] array = { 1, 2, 3, 4, 5 };
		
		System.out.println("Effects of passing reference to entire array:\n" + 
		"The velues of the original array are:");
		// output original array elements
		for(int value : array)
		 
		System.out.printf(" 	%d", value );
		
		modifyArray(array); // pass array reference
		 
		System.out.println("\n\nThe velues of the modified array are:");
		// output modified array elements
		for(int value : array) 
		 
		System.out.printf(" 	%d", value );
		
		System.out.printf("\n\nEffects of passing array element value:\n" +
		"array[3] before modifElemnt: %d\n", array[ 3 ] );
		
		modifyElement( array[3] ); // attempt to modify array[ 3 ]
		 
		System.out.printf("array[3] after modifyElement: %d\n", array[3] );
	} // end main
	// multiply each element of an array by 2
	public static void modifyArray(int[] array2) {
	     
		for(int counter = 0; counter < array2.length; counter++)
		array2[counter] *= 2;
	} // end methods modifyArray
	// multiply argument by 2
	public static void modifyElement(int element) {
	     
		element *= 2;
		 
		System.out.printf("Value of element in modifyElement: %d\n", element );
	} // end methods modifyElement
} // end class PasArray