/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Keypad.java Represents the keypad of the ATM
 *User: Muh. Asrul Mulis
 *Date: 02/Mei/2023
 *
 *Version(0.4)
 */
 
import java.util.Scanner;

public class Keypad {
     // program uses Scanner to obtain user input
	private Scanner input;
	 // no-argument constructor initializes the Scanner
	public Keypad() {
		 // reads data from the command line
		input = new Scanner(System.in);
	} // end no-argument Keypad constructor
	// return an integer value entered by user
	public int getInput() {
		 // we assume that user enters an integer
		return input.nextInt();
	} // end method getInput
} // end class Keypad