/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Composition demonstration.
 *User: Muh. Asrul Mulis
 *Date: 31/Maret/2023
 *
 *Version(3.04)
 */

public class EmployeeTes {
     
	public static void main(String[] args ) {
	     
		Date birth = new Date( 7, 24, 1949 );
		Date hire = new Date( 3, 12, 1988 );
		 
		Employee employee = new Employee("Bob", "Blue", birth, hire );
		 
		System.out.println(employee);
	} // end main
} // end class EmployeeTes