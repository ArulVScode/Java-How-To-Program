/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *BankDatabase.java Represents the bank account information database
 *User: Muh. Asrul Mulis
 *Date: 06/Mei/2023
 *
 *Version(0.8)
 */
 
public class BankDatabase {
     // array of account
	private Account2[] accounts;
	 // no-argument BankDatabase constructor initializes accounts
	public BankDatabase() {
		 
		accounts = new Account2[2]; // just 2 accounts for testing
		accounts[0] = new Account2( 12345, 54321, 1000.0, 1200.0 );
		accounts[1] = new Account2( 98765, 56789, 200.0, 200.0 );
	} // end no-argument BankDatabase constructor
	// retrieve Account object containing specified account number
	private Account2 getAccount( int accountNumber ) {
		 // loop through accounts searching for matching account number
		for( Account2 currentAccount : accounts ) {
			 // return current account if match found
			if( currentAccount.getAccountNumber() == accountNumber )
				 
			    return currentAccount;
		} // end for
		// if no matching account was found, return null
		return null; 
	} // end method getAccount
	// determine whether user-specified account number and PIN match
    // those of an account in the database
	public boolean autentichatUser( int userAccountNumber, int userPIN ) {
		 // attempt to retrieve the account with the account number
		Account2 userAccount = getAccount( userAccountNumber );
		 // if account exists, return result of Account method validatePIN
		if( userAccount != null ) 
			 
		    return userAccount.validatePIN( userPIN );
		else 
			 // account number not found, so return false
		    return false;
	} // end method autentichatUser
	// return available balance of Account with specified account number
	public double getAvailableBalance( int userAccountNumber ) {
		 
		return getAccount( userAccountNumber ).getAvailableBalance();
	} // end method getAvailableBalance
	// return total balance of Account with specified account number
	public double getTotalBalance( int userAccountNumber ) {
		 
		return getAccount( userAccountNumber ).getTotalBalance();
	} // end method getTotalBalance
	// credit an amount to Account with specified account number
	public void credit( int userAccountNumber, double amount ) {
		 
		getAccount( userAccountNumber ).credit( amount );
	} // end method credit
	// debit an amount from Account with specified account number
	public void debit( int userAccountNumber, double amount ) {
		 
		getAccount( userAccountNumber ).debit( amount );
	} // end method debit
} // end class BankDatabase