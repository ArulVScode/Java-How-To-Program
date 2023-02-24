/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Inputting and outputting floating-point numbers with Account objects
 *User: Muh. Asrul Mulis
 *Date: 24/February/2023
 *
 *Version(0.4)
 */

import java.util.Scanner;

public class AccountTes {
    // main method begins execution of Java application
	public static void main(String[] args) {
	    Account account1 = new Account(50.00); // create Account object
		Account account2 = new Account(-7.53); // create Account object
		
		// display initial balance of each object
		System.out.printf("Account1 Balance: $%.2f\n ", 
		account1.getBalance() );
		System.out.printf("Account2 Balance: $%.2f\n ", 
		account2.getBalance() );
		
		// create Scanner to obtain input from command window
		Scanner enter = new Scanner(System.in);
		double depositAmmount;
		
		System.out.print("Enter Deposit Ammount for Account1: ");
		depositAmmount = enter.nextDouble(); // obtain user input
		System.out.printf("\nadding %.2f to Account1 Balance\n\n",
        depositAmmount );
		account1.credit(depositAmmount); // add to account1 balance
		
		// display balances
		System.out.printf("Account Balance: $%.2f\n", 
		account1.getBalance() );
		System.out.printf("Account Balance: $%.2f\n", 
		account2.getBalance() );
		
		System.out.print("Enter Deposit Ammount for Account2: ");
		depositAmmount = enter.nextDouble(); // obtain user input
		System.out.printf("\nadding %.2f to account2 balance\n\n", 
		depositAmmount );
		account2.credit(depositAmmount); // add to account2 balance
		
		// display balances
		System.out.printf("Account Balance: $%.2f\n", 
		account1.getBalance() );
		System.out.printf("Account Balance: $%.2f\n", 
		account2.getBalance() );
	} //end main method
} //end class AccountTes