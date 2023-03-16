/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Initializing the elements of an array to default values of zero.
 *User: Muh. Asrul Mulis
 *Date: 16/Maret/2023
 *
 *Version(0.1)
 */

public class InitArray {
     
	public static void main(String[] args ) {
	     
		int[] array; // declare array named array
	    array = new int[10]; // create the array object
		 
		 System.out.printf("%s%8s\n", "Index", "Value"); // column headings
		 // output each array element's value
		for(int counter = 0; counter < array.length; counter++) {
		     
            System.out.printf("%5d%8d\n", counter, array[counter] );
		} // end for counter array.leght
	} // end main
} // end class InitArray