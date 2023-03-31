/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Testing enum type Book.
 *User: Muh. Asrul Mulis
 *Date: 31/Maret/2023
 *
 *Version(2.05)
 */
 import java.util.EnumSet;
 
public class EnumTes {
     
	public static void main(String[] args ) {
	      
		System.out.println("All books: \n");
		 // print all books in enum Book
		for(Book book : Book.values() ) 
		     
			System.out.printf("%-10s%-45s%s\n", book, 
			book.getTitle(), book.getCopyrightYear() );
		System.out.println("\nDisplay a range of enum constans: \n");
		 // print first four books
		for(Book book : EnumSet.range( Book.JHTP, Book.CPPHTP) ) 
		     
			System.out.printf("%-10s%-45s%s\n", book, 
			book.getTitle(), book.getCopyrightYear() );
	} // end main
} // end class EnumTes