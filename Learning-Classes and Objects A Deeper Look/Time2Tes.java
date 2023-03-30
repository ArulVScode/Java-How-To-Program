/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Overloaded constructors used to initialize Time2 objects.
 *User: Muh. Asrul Mulis
 *Date: 30/Maret/2023
 *
 *Version(2.03)
 */
 
public class Time2Tes {
      
	public static void main(String[] args ) {
	      
		Time2 t1 = new Time2(); // 00:00:00
		Time2 t2 = new Time2( 2 ); // 02:00:00
		Time2 t3 = new Time2( 21, 34 ); // 21:34:00
		Time2 t4 = new Time2( 12, 25, 42 ); // 12:25:42
		Time2 t5 = new Time2( t4 ); // 12:25:42
		 
		System.out.println("Contructed with: ");
		System.out.println("t1: All argument defaulted");
		System.out.printf(" 	%s\n", t1.toUniversalString() );
		System.out.printf(" 	%s\n", t1.toString() );
		 
		System.out.println("t2: hour specified; minute and second defaulted");
		System.out.printf(" 	%s\n", t2.toUniversalString() );
		System.out.printf(" 	%s\n", t2.toString() );
		 
		System.out.println("t3: hour and minute specified; second defaulted");
		System.out.printf(" 	%s\n", t3.toUniversalString() );
		System.out.printf(" 	%s\n", t3.toString() );
		 
		System.out.println("t4: hour, minute and second specified");
		System.out.printf(" 	%s\n", t4.toUniversalString() );
		System.out.printf(" 	%s\n", t4.toString() );
		 
		System.out.println("t5: Time2 object t4 specified");
		System.out.printf(" 	%s\n", t5.toUniversalString() );
		System.out.printf(" 	%s\n", t5.toString() );
		// attempt to initialize t6 with invalid values
		try {
		     
			Time2 t6 = new Time2( 27, 74, 99 );
		} // end try
		catch(IllegalArgumentException e) {
		      
			System.out.printf("\nException wile initializing t6: %s\n", 
			e.getMessage() );
		} // end catch
	} // end main
} // end class Time2Tes