/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Computing the sum of the elements of an array.
 *User: Muh. Asrul Mulis
 *Date: 17/Maret/2023
 *
 *Version(0.4)
 */


public class SumArray {
     
	public static void main(String[] args ) {
	     
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0;
		// add each element's value to total
		for(int counter = 0; counter < array.length; counter++) 
		total += array[counter];
	    System.out.printf("Total of array Elements: %d\n", total );
	} // end main
} // end class SumArray