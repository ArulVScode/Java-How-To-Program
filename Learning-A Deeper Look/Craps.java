/*
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Craps class simulates the dice game craps.
 *User: Muh. Asrul Mulis
 *Date: 10/Maret/2023
 *
 *Version(0.4)
 */

import java.util.Random;

public class Craps {
	 // create random number generator for use in method rollDice
	private static final Random randomNumbers = new Random();
     
	private enum Status { Continue, Won, Lost };
	 // constants that represent common rolls of the dice
	private static final int Snake_Eyes = 2;
	private static final int Trey = 3;
	private static final int Seven = 7;
	private static final int Yo_Leven = 11;
	private static final int Box_Cars = 12;
	// plays one game of craps
	public static void main(String[] args ) {
	       
		int myPoint = 0; // point if no win or loss on first roll
		Status gameStatus; // can contain CONTINUE, WON or LOST
		
		int sumOfDice = rollDice(); // first roll of the dice
		// determine game status and point based on first roll
		switch(sumOfDice) {
		     
			case Seven: // win with 7 on first roll
			case Yo_Leven: // win with 11 on first roll
               gameStatus = Status.Won;
			   break;
			case Snake_Eyes: // lose with 2 on first roll
			case Trey: // lose with 3 on first roll
			case Box_Cars: // lose with 12 on first roll
			   gameStatus = Status.Lost;
			default: // did not win or lose, so remember point
			  gameStatus = Status.Continue; // game is not over
			  myPoint = sumOfDice; // remember the point
			  System.out.printf("Point is %d\n ", myPoint ); 
			  break; // optional at end of switch
		} // end switch
		// while game is not complete
		while(gameStatus == Status.Continue) { // not WON or LOST
		     
			sumOfDice = rollDice(); // roll dice again
			
			if(sumOfDice == myPoint) { // win by making point
			     
				gameStatus = Status.Won; 
			} // end if
			else if(sumOfDice == Seven) { // lose by rolling 7 before point
			      
				gameStatus = Status.Lost;
			} // end else if
		}
		// display won or lost message
		if(gameStatus == Status.Won) {
		     
			System.out.println("Players Wins");
		} // end if
		else {
		     
			System.out.println("Players Los");
		} // end else
	} // end main
	// roll dice, calculate sum and display results
	public static int rollDice() {
	      // pick random die values
		int die1 = 1 + randomNumbers.nextInt( 6 ); // first die roll
		int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll
		
		int sum = die1 + die2; // sum of die values
		// display results of this roll
		System.out.printf("Playerd Rolled %d + %d = %d\n", 
		die1, die2, sum );
		
		return sum; // return sum of dice
	} // end method rollDice
} // end class Craps