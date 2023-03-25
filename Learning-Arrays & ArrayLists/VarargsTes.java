/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Using variable-length argument lists.
 *User: Muh. Asrul Mulis
 *Date: 24/Maret/2023
 *
 *Version(0.14)
 */
 
 public class VarargsTes {
     // calculate average
    public static double average(double...numbers) {
	     
		double total = 0.0; // initialize total
		 // calculate total using the enhanced for statement
		for(double d : numbers) 
		     
	        total += d;
		return total / numbers.length;
	} // end method average

	public static void main(String[] args ) {
	      
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",  
		d1, d2, d3, d4 );
		  
		System.out.printf("Average of d1 & d2 is %.1f\n", average( d1, d2 ) );
		 
		System.out.printf("Average of d1, d2, & d3 is %.1f\n", 
		average( d1, d2, d3 ) );
		 
		System.out.printf("Average of d1, d2, d3, & d4 is %.1f\n", 
		average( d1, d2, d3, d4 ) );
	} // end main
} // end class VarargsTes