/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Calculating the values to be placed into the elements of an array.
 *User: Muh. Asrul Mulis
 *Date: 16/Maret/2023
 *
 *Version(0.3)
 */

public class InitArrayLength {
     
	public static void main(String[] args) {
	        
	    final int ARRAY_LENGTH = 10; // declare constant
		int[] array = new int[ARRAY_LENGTH]; // create array
		 // calculate value for each array element
		for(int counter = 0; counter < array.length; counter++) {
		     
			array[counter] = 2 + 2 * counter;
		} // end for array counter
		
		System.out.printf("%s%8s\n", "Index", "Value"); // column headings
		// output each array element's value
		for(int counter = 0; counter < array.length; counter++) {
		     
			System.out.printf("%5d%8d\n", counter, array[counter] );
		} // end for counter array.length
	} // end main
} // end class InitArrayLength