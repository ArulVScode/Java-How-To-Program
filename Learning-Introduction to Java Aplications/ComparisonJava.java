/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Compare integers using if statements, relational operators
  and equality operators.
 *User: Muh. Asrul Mulis
 *Date: 20/February/2023
 *
 *Version(0.6)
 */

import java.util.Scanner;

//class name
public class ComparisonJava {
     //main method begins execution of java aplication
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		int numbers1;
		int numbers2;
		//Create Scanner to obtain input from in the Command Line
		System.out.print("Enter Numbers1: "); // first number to compare
		numbers1 = input.nextInt();
		System.out.print("Enter Numbers2: "); // second number to compare
		numbers2 = input.nextInt();
		
		if( numbers1 == numbers2 )
		System.out.printf( "%d == %d\n", numbers1, numbers2 );
	
		if( numbers1 != numbers2 )
		System.out.printf( "%d != %d\n", numbers1, numbers2 );
	    
		if( numbers1 < numbers2 )
		System.out.printf( "%d < %d\n", numbers1, numbers2 );
	    
		if( numbers1 > numbers2 )
		System.out.printf( "%d > %d\n", numbers1, numbers2 );
	    
		if( numbers1 <= numbers2 )
		System.out.printf( "%d <= %d\n", numbers1, numbers2 );
	    
		if( numbers1 >= numbers2 )
		System.out.printf( "%d >= %d\n", numbers1, numbers2 );
	} //end method
} //end class ComparisonJava