/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Initializing the elements of an array with an array initializer.
 *User: Muh. Asrul Mulis
 *Date: 16/Maret/2023
 *
 *Version(0.2)
 */

public class InitArrayValue {
     
	public static void main(String[] args ) {
	     // initializer list specifies the value for each element
		int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		
		System.out.printf("%s%8s\n", "Index", "Value"); // column headings
		// output each array element's value
		for(int counter = 0; counter < array.length; counter++) {
		     
			System.out.printf("%5d%8d\n", counter, array[counter] );
		} // end for counter array.length
	} // end main
} // end class InitArrayValue