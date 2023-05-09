/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *BalanceInquiry.java Represents a balance inquiry ATM transaction
 *User: Muh. Asrul Mulis
 *Date: 09/Mei/2023
 *
 *Version(0.10)
 */
 
public class BalanceInquiry extends Transaction {
     // BalanceInquiry constructor
	public BalanceInquiry( int userAccountNumber, Screen atmScreen, 
	BankDatabase atmBankDatabase ) {
		 
		super( userAccountNumber, atmScreen, atmBankDatabase );
	} // end BalanceInquiry constructor
	@Override // performs the transaction
	public void execute() {
		 // get references to bank database and screen
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		 // get the available balance for the account involved
		double availableBalance = bankDatabase.getAvailableBalance( getAccountNumber() );
		 // get the total balance for the account involved
		double totalBalance = bankDatabase.getTotalBalance( getAccountNumber() );
		 // display the balance information on the screen
		screen.displayMessageLine("\nBalance Information:");
		screen.displayMessage(" - Available balance: ");
		screen.displayDollarAmount( availableBalance );
		screen.displayMessage("\n -  total balance: ");
		screen.displayDollarAmount( totalBalance );
		screen.displayMessageLine("");
	} // end method execute
} // end class BalanceInquiry