/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *ATM.java Represents an automated teller machine
 *User: Muh. Asrul Mulis
 *Date: 01/Mei/2023
 *
 *Version(7.1)
 */
 
public class ATM {
     
	private boolean userAuthenticated; // whether user is authenticated
	private int currentAccountNumber; // current user's account number
	private Screen screen; // ATM's screen
	private Keypad keypad; // ATM's keypad
	private CashDispenser cashDispenser; // ATM's cashDispenser
	private DepositSlot depositSlot; // ATM's depositSlot
	private BankDatabase bankDatabase; // account information database
	 // constants corresponding to main menu options
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	 // no-argument ATM constructor initializes instance variables
	public ATM() {
		 
		userAuthenticated = false; // user is not authenticated to start
		currentAccountNumber = 0; // no current account number to start
		screen = new screen(); // create screen
		keypad = new keypad(); // create keypad
		cashDispenser = new cashDispenser(); // create cash dispenser
		depositSlot = new depositSlot(); // create deposit slot
		bankDatabase = new bankDatabase(); // create bank database
	} // end no-argument ATM constructor
	// start ATM
	public void run() {
		 // welcome and authenticate user; perform transactions
		while(true) {
			 // loop while user is not yet authenticated
			while( !userAuthenticated ) {
				 
				screen.displayMessageLine("\nWelcome!");
				authenticateUser(); // authenticate user
			} // end while 
			
			perfromeTransactions(); // user is now authenticated
			userAuthenticated = false; // reset before next ATM session
			currentAccountNumber = 0; // reset before next ATM session
			screen.displayMessageLine("\nThank you! Good bye!");
		} // end while 
	} // end method run 
	// attempts to authenticate user against database
	private void authenticateUser() {
		 
		screen.displayMessageLine("\nPlease enter your account number: "); // input account number
		int accountNumber = Keypad.getInput(); // prompt for pin 
		screen.displayMessageLine("\nEnter your PIN: "); // input pin 
		int pin = Keypad.getInput();
		 // set userAuthenticated to boolean value returned by database
		userAuthenticated = bankDatabase.authenticateUser( accountNumber, pin );
		 // check whether authentication succeeded
		if(userAuthenticated) {
			 
			currentAccountNumber = accountNumber; // save user's account #
		} // end if 
		else
			 
			screen.displayMessageLine("Invalid account number or PIN. Please try again.");
	} // end method authenticateUser
	// display the main menu and perform transactions
	private void perfromeTransactions() {
		 // local variable to store transaction currently being processed
		Transaction currentTransaction = null;
		 // user has not chosen to exit
		boolean userExited = false;
		 // loop while user has not chosen option to exit system
		while( !userExited ) {
			 // show main menu and get user selection
			int mainMenuSelection = displayMainMenu();
			 // decide how to proceed based on user's menu selection
			switch(mainMenuSelection) {
				 // user chose to perform one of three transaction types
				case BALANCE_INQUIRY:
				case WITHDRAWAL:
				case DEPOSIT:
				     // initialize as new object of chosen type
					currentTransaction = creatTransaction( mainMenuSelection );
					 
					currentTransaction.execute(); // execute transaction
				      
					break;
				case EXIT: // user chose to terminate session
				       
					screen.displayMessageLine("\nExiting the system...");
					userExited = true; // this ATM session should end
					 
					break;
				default: // user did not enter an integer from 1-4
				     
					screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
					 
					break;
			} // end switch
		} // end while
	} // end method perfromeTransactions
	// display the main menu and return an input selection
	private int displayMainMenu() {
		 
		screen.displayMessageLine("\nMain menu:");
		screen.displayMessageLine("1 - View my balance");
		screen.displayMessageLine("2 - Withdraw cash");
		screen.displayMessageLine("3 - Deposit funds");
		screen.displayMessageLine("4 - Exit\n");
		screen.displayMessageLine("Enter a choice: ");
		return keypad.getInput(); // return user's selection
	} // end method displayMainMenu
	// return object of specified Transaction subclass
	private Transaction creatTransaction( int type ) {
		 // temporary Transaction variable
		Transaction temp = null;
		 // determine which type of Transaction to create
		switch(type) {
			 
			case BALANCE_INQUIRY: // create new BalanceInquiry transaction
			     
				temp = new BalanceInquiry( currentAccountNumber, screen, bankDatabase );
				 
				break;
			case WITHDRAWAL: // create new Withdrawal transaction
				 
				temp = new Withdrawal( currentAccountNumber, screen, bankDatabase, 
				keypad, cashDispenser );
				 
				break;
			case DEPOSIT: // create new Deposit transaction
				 
				temp = new Deposit( currentAccountNumber, screen, bankDatabase, 
				keypad, depositSlot );
				 
				break;
		} // end switch
		// return the newly created object
		return temp; 
	} // end method Transaction creatTransaction
} // end class ATM 