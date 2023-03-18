/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *DeckOfCards class represents a deck of playing cards.
 *User: Muh. Asrul Mulis
 *Date: 18/Maret/2023
 *
 *Version(2.8)
 */

import java.util.Random;

public class DeckOfChard {
     
	private Chard[] deck; // array of Card objects
	private int currentChard; // index of next Card to be dealt (0-51)
	private static final int NUMBERS_OF_CHARD = 52; // constant # of Cards
	// random number generator
	private static final Random randomNumbers = new Random();
	// constructor fills deck of Cards
	public DeckOfChard() {
	     
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
		"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		
		deck = new Chard[NUMBERS_OF_CHARD];
		currentChard = 0; // set currentCard so first Card dealt is deck[ 0 ]
		// populate deck with Card objects
		for(int count = 0;  count < deck.length; count++)
		 
		deck[count] = new Chard( faces[ count % 13 ], suits[ count / 13 ] );
	} // end DeckOfChard constructor
	// shuffle deck of Cards with one-pass algorithm
	public void shuffle() {
	     // after shuffling, dealing should start at deck[ 0 ] again
		currentChard = 0; // reinitialize currentCard
		// for each Card, pick another random Card (0-51) and swap them
		for(int first = 0; first < deck.length; first++) {
		     // select a random number between 0 and 51
			int secound = randomNumbers.nextInt(NUMBERS_OF_CHARD);
			// swap current Card with randomly selected Card
			Chard temp = deck[first];
			deck[first] = deck[secound];
			deck[secound] = temp;
		} // end for
	} // end method shuffle
	// deal one Card
	public Chard dealChard() {
	     // determine whether Cards remain to be dealt
		if(currentChard < deck.length) 
		     
		return deck[currentChard++]; // return current Card in array
		else 
		     
		return null; // return null to indicate that all Cards were dealt
	} // end method dealChard
} // end class DeckOfChard