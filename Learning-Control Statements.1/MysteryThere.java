/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Mystery There
 *User: Muh. Asrul Mulis
 *Date: 03/Maret/2023
 *
 *Version(0.9)
 */

public class MysteryThere {
      
	public static void main(String[] args) {
	       
		int row = 10;
		int column;
		
		while(row >= 1) {
		     
			column = 1;
			
            while(column <= 10) {
		         
			    System.out.println( row %2 == 1? "<" : ">");
			    ++column;
		    } // end while
	    	--row;
	    	System.out.println();			 
		}
	} // end main
} // end class MysteryThere