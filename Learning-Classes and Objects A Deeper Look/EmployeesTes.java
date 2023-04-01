/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *static member demonstration.
 *User: Muh. Asrul Mulis
 *Date: 01/April/2023
 *
 *Version(2.06)
 */
 
public class EmployeesTes {
      
	public static void main(String[] args) {
	     // show that count is 0 before creating Employees
		System.out.printf("Employees before intatiation: %d\n", Employees.getCount() );
		 // create two Employees; count should be 2
		Employees e1 = new Employees("Susan", "Baker");
		Employees e2 = new Employees("Bob", "Blue");
		 // show that count is 2 after creating two Employees
		System.out.println("\nEmployees after intatiation : ");
		System.out.printf("Via e1.getCount: %d\n", e1.getCount() );
		System.out.printf("Via e2.getCount: %d\n", e2.getCount() );
		System.out.printf("Via Employees.getCount: %d\n", Employees.getCount() );
		 // get names of Employees
		System.out.printf("Employees 1: %s%s\nEmployees 2: %s %s\n", 
		e1.getFirstName(), e1.getLastName(),  
		e2.getFirstName(), e2.getLastName() );
		 // in this example, there is only one reference to each Employee,
         // so the following two statements indicate that these objects
         // are eligible for garbage collection
		e1 = null;
		e2 = null;
	} // end main
} // end class EmployeesTes