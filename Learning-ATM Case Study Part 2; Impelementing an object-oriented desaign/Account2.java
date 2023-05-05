/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Account.java Represents a bank account
 *User: Muh. Asrul Mulis
 *Date: 05/Mei/2023
 *
 *Version(0.7)
 */
 
public class Account2 {
      
	private int accountNumber; // account number
	private int pin; // PIN for authentication
	private double availableBalance; // funds available for withdrawal
	private double totalBalance; // funds available + pending deposits
	 // Account constructor initializes attributes
	public Account2( int theAccountNumber, int thePIN, 
	double theAvailebleBalance, double theTotalBalance ) {
		 
		accountNumber = theAccountNumber;
		pin = thePIN;
		availableBalance = theAvailebleBalance;
		totalBalance = theTotalBalance;
	} // end account constructor
	// determines whether a user-specified PIN matches PIN in Account
	public boolean validatePIN( int userPIN ) {
		 
		if( userPIN == pin )
			 
		    return true;
		else 
			 
		    return false;
	} // end method validatePIN
	// returns available balance
	public double getAvailableBalance() {
		 
		return availableBalance;
	} // end getAvailableBalance
	// returns the total balance
	public double getTotalBalance() {
		 
		return totalBalance;
	} // end method getTotalBalance
	// credits an amount to the account
	public void credit( double amount ) {
		 
		totalBalance += amount; // add total balance
	} // end method credit
	// debits an amount from the account
	public void debit( double amount ) {
		 
		availableBalance -= amount; // subtract from available balance
		totalBalance -= amount; // subtract from total balance
	} // end method debit
	// returns account number
	public int getAccountNumber() {
		 
		return accountNumber;
	} // end method getAccountNumber
} // end class Account2