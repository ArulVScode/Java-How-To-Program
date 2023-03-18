/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Card shuffling and dealing.
 *User: Muh. Asrul Mulis
 *Date: 18/Maret/2023
 *
 *Version(3.8)
 */
 
public class DeckOfChardTes {
     // execute application
	public static void main(String[] args ) {
	     
        DeckOfChard myDeckOfChard = new DeckOfChard();
        myDeckOfChard.shuffle(); // place Cards in random order
        // print all 52 Cards in the order in which they are dealt
		for(int i = 1; i <= 52; i++) {
		     // deal and display a Card
			System.out.printf("%-19s\n", myDeckOfChard.dealChard() );
			
			if(i % 4 == 0) // output a newline after every fourth card
			      
			System.out.println();
		} // end for
	} // end main
} // end class DeckOfChardTes