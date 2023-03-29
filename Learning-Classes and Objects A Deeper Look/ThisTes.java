/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *this used implicitly and explicitly to refer to members of an object.
 *User: Muh. Asrul Mulis
 *Date: 28/Maret/2023
 *
 *Version(0.03)
 */
 
public class ThisTes {
     
	public static void main(String[] args ) {
	      
		SimpleTime time = new SimpleTime( 15, 30, 19 );
		System.out.println( time.buildString() );
	} // end main
} // end class ThisTes
// class SimpleTime demonstrates the "this" reference
class SimpleTime {
     
	private int hour; // 0-23
	private int minute; // 0-59
	private int second; // 0-59
	 
	 // if the constructor uses parameter names identical to
     // instance variable names the "this" reference is
     // required to distinguish between the names
	public SimpleTime( int hour, int minute, int second ) {
	     
		this.hour = hour; // set "this" object's hour
		this.minute = minute; // set "this" object's minute
		this.second = second; // set "this" object's second
	} //end SimpleTime constructor
	// use explicit and implicit "this" to call toUniversalString
	public String buildString() {
	     
		return String.format("%24s: %s\n%24s: %s", "this.toUniversalString()", this.toUniversalString(), 
		"toUniversalString", toUniversalString() );
	} // end method buildString
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
	     // "this" is not required here to access instance variables,
         // because method does not have local variables with same
         // names as instance variables
		return String.format("%02d:%02d:%02d", 
		this.hour, this.minute, this.second );
	} // end method toUniversalString
} // end Class SimpleTime