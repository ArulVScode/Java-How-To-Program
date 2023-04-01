/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Static variable used to maintain a count of the number of Employee objects in memory.
 *User: Muh. Asrul Mulis
 *Date: 01/April/2023
 *
 *Version(1.06)
 */
 
public class Employees {
     
	private String firstName;
	private String lastName;
	private static int count = 0; // number of Employees created
	// initialize Employee, add 1 to static count and
    // output String indicating that constructor was called
	public Employees(String first, String last) {
	      
		firstName = first;
		lastName = last;
		 
		++count; // increment static count of employees
		 
		System.out.printf("Employee constructor:  %s %s; count = %d\n", firstName, 
		lastName, count );
	} // end Employees constructor
	// get first name
	public String getFirstName() {
	      
		return firstName;
	} // end method getFirstName
	// getLastName
	public String getLastName() {
	     
		return lastName;
	} // end method getLastName
	// static method to get static count value
	public static int getCount() {
	     
		return count;
	} // end method getCount
} // end class Employees