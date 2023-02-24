/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Account class with a constructor to validate and initialize instance variable balance of type double.
 *User: Muh. Asrul Mulis
 *Date: 24/February/2023
 *
 *Version(0.4)
 */

public class Account {
    
	private double balance; // instance variable that stores the balance
	// constructor
	public Account (double initialBalance ) {
		// validate that initialBalance is greater than 0.0;
       // if it is not, balance is initialized to the default value 0.0
	    if(initialBalance > 0.0 ) 
		balance = initialBalance;
	} //end Account contsruktor
	// credit (add) an amount to the account
	public void credit(double ammount ) {
	    balance = balance + ammount; // add amount to balance
	} //end method balance
	// return the account balance
	public double getBalance() {
	    return balance; // gives the value of balance to the calling method
    } // end method getBalance
} // end class Account