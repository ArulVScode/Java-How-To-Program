/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Card class represents a playing card.
 *User: Muh. Asrul Mulis
 *Date: 18/Maret/2023
 *
 *Version(1.8)
 */

public class Chard {
     
	private String face; // face of card ("Ace", "Deuce", ...)
	private String suit; // suit of card ("Hearts", "Diamonds", ...)
	// two-argument constructor initializes card's face and suit
	public Chard(String chardFace, String chardSuit ) {
	     
		face = chardFace;
		suit = chardSuit;
	} // end to argument to card constructor
	// return String representation of Card
	public String toString() {
	     
		return face + "of" + suit;
	} // end method to String
} // end class Chard