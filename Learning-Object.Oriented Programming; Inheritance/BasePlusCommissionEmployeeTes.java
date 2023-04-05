/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *BasePlusCommissionEmployee test program.
 *
 *User: Muh. Asrul Mulis
 *Date: 05/April/2023
 *
 *Version(2.2)
 */ 
 
public class BasePlusCommissionEmployeeTes {
        
    public static void main(String[] args ) {
	     // instantiate BasePlusCommissionEmployee object
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee( "Bob", "Lewis", "333-33-3333", 
		5000, .04, 300 );
		 // get base-salaried commission employee data
		System.out.println("Employee information obtained by get methods: \n");
		System.out.printf("%s %s\n", "First name is", employee.getFirstName() );
		System.out.printf("%s %s\n", "Last name is", employee.getLastName() );
		System.out.printf("%s %s\n", "Social securty number is", employee.getSocialSecurityNumber() );
		System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales() );
		System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate() );
		System.out.printf("%s %.2f\n", "Base salary is", employee.getBaseSalary() );
		 
		employee.setBaseSalary( 1000 );
		 
		System.out.printf("\n%s: \n\n%s\n", "Update Employee information obtained by toString", 
		employee.toString() );
	} // end main
} // end class BasePlusCommissionEmployeeTes