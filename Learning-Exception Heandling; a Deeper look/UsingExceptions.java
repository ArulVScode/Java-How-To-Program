/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *try...catch...finally exception handling mechanism.
 *
 *User: Muh. Asrul Mulis
 *Date: 12/April/2023
 *
 *Version(0.3)
 */
 
public class UsingExceptions {
       
	public static void main(String[] args) {
	      
		try {
		     // call method throwException
			throwException();
		} // end try
		catch(Exception exception) { // exception thrown by throwException
			 
			System.err.println("Exception handled in main");
		} // end catch
		doeasNotThrowException(); 
	} // end main
	// demonstrate try...catch...finally
	public static void throwException() throws Exception {
		 // throw an exception and immediately catch it
		try {
			 
			System.out.println("Method throwException");
			throw  new Exception();
		} // end try
		catch(Exception exception) { // catch exception thrown in try
			 
			System.err.println("Exception handled in method throwException");
			throw exception; // rethrow for further processing
			// code here would not be reached; would cause compilation errors
		} // end catch
		finally { // executes regardless of what occurs in try...catch
			 
			System.err.println("Finally executed in throwException");
		} // end finally 
		// code here would not be reached; would cause compilation errors
	} // end method throwException
	// demonstrate finally when no exception occurs
	public static void doeasNotThrowException() {
		 // try block does not throw an exception
		try {
			 
			System.out.println("Method doeasNotThrowException");
		} // end try
		catch(Exception exception) { // does not executed
			 
			System.err.println( exception ); 
		} // end catch
		finally { // executes regardless of what occurs in try...catch
			 
			System.err.println("Finally executed in doesNotThrowException");
		} // end finally
		 
		System.out.println("End of method doesNotThrowException");
	} // end method doeasNotThrowException
} // end class UsingExceptions