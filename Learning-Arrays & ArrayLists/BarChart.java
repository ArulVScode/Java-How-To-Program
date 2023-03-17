/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *BarChart Printing Program.
 *User: Muh. Asrul Mulis
 *Date: 17/Maret/2023
 *
 *Version(0.5)
 */

public class BarChart {
     
	public static void main(String[] args ) {
	        
		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1, };
		
		System.out.println("Grade Distribution:");
		// for each array element, output a bar of the chart
		for(int counter = 0; counter < array.length; counter++) {
		     // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
			if(counter == 10) {
			     
				System.out.printf("  %5d: ", 100 );
			}
			else {
			     
				System.out.printf("%02d - %02d: ", 
				counter * 10, counter * 10 + 9 );
			}
			
			// print bar of asterisks
	    	for(int star = 0; star < array[counter]; star++) {
		     
		    	System.out.print("*");
		    } // end for stars
			System.out.println(); // start a new line of output
		} // end outer for
	} // end main
} // end class BarChart