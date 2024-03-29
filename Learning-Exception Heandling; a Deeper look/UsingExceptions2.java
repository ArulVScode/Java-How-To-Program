/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Stack unwinding and obtaining data from an exception object.
 *
 *User: Muh. Asrul Mulis
 *Date: 12/April/2023
 *
 *Version(0.4)
 */
 
public class UsingExceptions2 {
        
	public static void main(String[] args) {
	     
		try {
			 
			method1(); // call method1
		} // end try
		catch(Exception exception) { // catch exception thrown in method1
			 
			System.err.printf("%s\n\n", exception.getMessage() );
			     // print exception stack trace
			    exception.printStackTrace();
			StackTraceElement[] traceElements = exception.getStackTrace(); // obtain the stack-trace information
			 
			System.out.println("\nStack trace from getStackTrace:");
			System.out.println("Class\t\tFile\t\t\tLine\tMethod");
			 // loop through traceElements to get exception description
			for(StackTraceElement element : traceElements) {
				 
				System.out.printf("%s\t", element.getClassName() );
		    	System.out.printf("%s\t", element.getFileName() );
		    	System.out.printf("%s\t", element.getLineNumber() );
		    	System.out.printf("%s\n", element.getMethodName() );
			} // end for
		} // end catch
	} // end main
	// call method2; throw exceptions back to main
	public static void method1() throws Exception {
		 
		method2();
	} // end method1
	// call method3; throw exceptions back to method1
	public static void method2() throws Exception {
		 
		method3();
	} // end method2
	// throw Exception back to method2
	public static void method3() throws Exception {
		 
		throw new Exception("Exception thrown in method3");
	} // end method3
} // end class UsingExceptions2