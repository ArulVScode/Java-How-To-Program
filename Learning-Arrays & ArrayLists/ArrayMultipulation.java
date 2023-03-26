/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Arrays class methods and System.arraycopy.
 *User: Muh. Asrul Mulis
 *Date: 26/Maret/2023
 *
 *Version(0.16)
 */

import java.util.Arrays; 

public class ArrayMultipulation {
        
	public static void main(String[] args ) {
	     // sort doubleArray into ascending order
		double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		Arrays.sort(doubleArray);
		 
		System.out.printf("\nDouble Array : ");
		 
		for(double value : doubleArray) 
		     
			System.out.printf("%.1f\n ", value );
		int[] filedIntArray = new int[10]; // fill 10-element array with 7s
		Arrays.fill(filedIntArray, 7);
		 
		displayArray( filedIntArray, "filedIntArray" );
		 // copy array intArray into array intArrayCopy
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];
		 
		System.arraycopy( intArray, 0, intArrayCopy, 0, intArray.length );
		 
		displayArray( intArray, "intArray" );
		displayArray(intArrayCopy, "intArrayCopy" );
		 // compare intArray and intArrayCopy for equality
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("\n\nintArray %s intArrayCopy\n", 
		(b ? "==" : "!=") );
		 // compare intArray and filledIntArray for equality
		b = Arrays.equals(intArray, filedIntArray);
		System.out.printf("intArray %s filedIntArray\n", 
		(b ? "==" : "!=") );
		 // search intArray for the value 5
		int location = Arrays.binarySearch(intArray, 5);
		     
			if(location >= 0)
			     
				System.out.printf("Found 5 at element %d in intArray\n", location );
				 
			else 
			     
				System.out.println("5 nout found in intArray");
			 	 
			location = Arrays.binarySearch(intArray, 8763); // search intArray for the value 8763
			 
			if(location >= 0) 
			     
				System.out.printf("Found 8763 at element %d in intArray\n", location );
				 
			else 
			     
				System.out.println("8763 nout found in intArray");
	} // end main
	// output values in each array
	public static void displayArray( int[] array, String description ) {
	      
		System.out.printf("\n%s ", description );
		 
		for(int value : array) 
		     
			System.out.printf("%d ", value );
	} // end method displayArray
} // end class ArrayMultipulation