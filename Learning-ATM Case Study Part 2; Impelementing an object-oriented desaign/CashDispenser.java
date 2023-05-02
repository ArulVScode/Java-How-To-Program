/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *CashDispenser.java Represents the cash dispenser of the ATM
 *User: Muh. Asrul Mulis
 *Date: 02/Mei/2023
 *
 *Version(0.5)
 */

public class CashDispenser {
     // the default initial number of bills in the cash dispenser
	private final static int INITIAL_COUNT = 500;
	private int count; // number of $20 bills reamining
	 // no-argument CashDispenser constructor initializes count to default
	public CashDispenser() {
		 // set count attribute to default
		count = INITIAL_COUNT;
	} // end no-argument CashDispenser constructor
	// simulates dispensing of specified amount of cash
	public void dispenserCash( int amount ) {
		 // number of $20 bills required
		int billsRequired = amount / 20; 
		count -= billsRequired; // update the count of bills
	} // end method dispenserCash
	// indicates whether cash dispenser can dispense desired amount
	public boolean isSufficientCashAvialable( int amount ) {
		 // number of $20 bills required
		int billsRequired = amount / 20;
		 
		if( count >= billsRequired )
			 // enough bills available
		    return true;
		else 
			 // not enough bills available
		    return false;
	} // end method isSufficientCashAvialable
} // end class CashDispenser