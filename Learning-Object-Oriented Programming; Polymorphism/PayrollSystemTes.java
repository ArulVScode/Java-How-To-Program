/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *BasePlusCommissionEmployee4 class extends CommissionEmployee2.
 *User: Muh. Asrul Mulis
 *Date: 09/April/2023
 *
 *Version(6.2)
 */

public class PayrollSystemTes {
     
	public static void main(String[] args ) {
	     
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		 
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 70);
		 
		CommissionEmployee2 commissionEmployee2 = new CommissionEmployee2("Sue", "Jones", 
		"333-33-3333", 10000, .06);
		 
		BasePlusCommissionEmployee4 basePlusCommissionEmployee4 = new BasePlusCommissionEmployee4("Bob", "Lewis", 
		"444-44-4444", 5000, .04, 300);
		 
		System.out.println("Employees processed individually:\n");
		System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, 
		"Earned", salariedEmployee.earnings() );
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, 
		"Earned", hourlyEmployee.earnings() );
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee2, 
		"Earned", commissionEmployee2.earnings() );
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee4, 
		"Earned", basePlusCommissionEmployee4.earnings() );
		 
		Employee2[] employees2 = new Employee2[4];
		 
		employees2[0] = salariedEmployee;
		employees2[1] = hourlyEmployee;
		employees2[2] = commissionEmployee2;
		employees2[3] = basePlusCommissionEmployee4;
		 
		System.out.println("Employees processed polymorphically:\n");
		 
		for(Employee2 currentEmployee2 : employees2) {
			 
			System.out.println( currentEmployee2 );
			 
			if(currentEmployee2 instanceof BasePlusCommissionEmployee4) {
				 
				BasePlusCommissionEmployee4 employee2 = 
				( BasePlusCommissionEmployee4 ) currentEmployee2;
				 
				employee2.setBaseSalary( 1.10 * employee2.getBaseSalary() );
				 
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", 
				employee2.getBaseSalary() );
			}
			
			System.out.printf("earned $%,.2f\n\n", currentEmployee2.earnings() );
		}
		
		for(int j = 0; j < employees2.length; j++) 
			 
		    System.out.printf("Employee %d is a %s\n", j, 
			employees2[j].getClass().getName() );
	}
}