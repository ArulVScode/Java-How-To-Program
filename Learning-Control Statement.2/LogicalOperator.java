/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Logical Operators
 *User: Muh. Asrul Mulis
 *Date: 07/Maret/2023
 *
 *Version(0.9)
 */

public class LogicalOperator {
     
	public static void main(String[] args ) {
	      // create truth table for && (conditional AND) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",  
		"Conditional AND (&&)",
		"false && false", (false && false),
		"false && true", (false && true), 
		"true && false", (true && false), 
		"true && true", (true && true) );
		// create truth table for || (conditional OR) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
		"Conditional AND (||)", 
		"false || false", (false || false), 
		"false || true", (false || true), 
		"true || false", (true || false), 
		"true || true", (true || true) );
		// create truth table for & (boolean logical AND) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
		"Boolean Logical AND (&)", 
		"false & false", (false & false), 
		"false & true", (false & true), 
		"true & false", (true & false), 
		"true & true", (true & true) );
		// create truth table for | (boolean logical inclusive OR) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
		"Boolean Logical Inclusive OR (|)", 
		"false | false", (false | false), 
		"false | true", (false | true), 
		"true | false", (true | false), 
        "true | true", (true | true) );
		// create truth table for ^ (boolean logical exclusive OR) operator
		System.out.printf("%s\n%s: %b\n%s, %b\n%s: %b\n%s: %b\n\n", 
		"Boolean Logical exclusive OR (^)", 
		"false ^ false", (false ^ false), 
		"false ^ true", (false ^ true), 
		"true ^ false", (true ^ false), 
		"true ^ true", (true ^ true) );
		// create truth table for ! (logical negation) operator
		System.out.printf("%s\n%s: %b\n%s: %b\n", "Logical NOT (!)", 
		"!false", (!false), "!true", (!true) );
	} // end main
} // end class LogicalOperator