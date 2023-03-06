/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Compound-interest calculations with for.
 *
 *User: Muh. Asrul Mulis
 *Date: 06/Maret/2023
 *
 *Version(0.4)
 */

public class Interest {
     
	public static void main(String[] args) {
	      
		double ammount; // amount on deposit at end of each year
		double principal = 1000.0; // initial amount before interest
		double rate = 0.05; // interest rate
		// display headers
		System.out.printf("%s%20s\n", "Year ", "Ammount on Deposit");
		// calculate amount on deposit for each of ten years
		for(int year = 1; year <= 10; year++) {
			 // calculate new amount for specified year
			ammount = principal * Math.pow(1.0 + rate, year);
			// display the year and the amount
			System.out.printf("%4d%,20.2f\n", year, ammount );
		} //end for
	} // end main
} // end class Interest