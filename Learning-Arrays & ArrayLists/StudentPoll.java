/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Poll analysis program.
 *User: Muh. Asrul Mulis
 *Date: 18/Maret/2023
 *
 *Version(0.7)
 */

public class StudentPoll {
       
	public static void main(String[] args ) {
	      // student response array (more typically, input at runtime)
		int[] responsies = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
		2, 3, 3, 2, 14 };
		
        int[] frequency = new int[6]; // array of frequency counters
		// for each answer, select responses element and use that value
        // as frequency index to determine element to increment
		for(int answer = 0; answer < responsies.length; answer++) {
		     
			try {
			     
				++frequency[ responsies[answer] ];
			} // end try
			
			catch(ArrayIndexOutOfBoundsException e) {
			      
				System.out.println(e);
				System.out.printf("responsies[%d]: %d\n\n",
				answer, responsies[answer] );
			} // end catch
		} // end for answer
		
		System.out.printf("%s%10s\n", "Ratting", "Frequency");
		// output each array element's value
		for(int ratting = 1; ratting < frequency.length; ratting++)
		 
		System.out.printf("%4d%10d\n", ratting, frequency[ratting] );
	} // end main
} // end class StudentPoll