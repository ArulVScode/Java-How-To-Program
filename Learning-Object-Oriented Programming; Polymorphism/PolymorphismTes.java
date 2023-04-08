/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Assigning superclass and subclass references to superclass and subclass variables.
 *
 *User: Muh. Asrul Mulis
 *Date: 08/April/2023
 *
 *Version(0.1)
 */
 
public class PolymorphismTes {
     
	public static void main(String[] args) {
	     // assign superclass reference to superclass variable
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", 
		"222-22-2222", 10000, .6 );
		 // assign subclass reference to subclass variable
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", 
		"333-33-3333", 5000, .04, 300 );
		 	 // invoke toString on superclass object using superclass variable
		System.out.printf("%s %s:\n\n%s\n\n", 
		"Call CommissionEmployee's toString with superclass reference", 
		"to superClass object", commissionEmployee.toString() );
		 // invoke toString on subclass object using subclass variable
		System.out.printf("%s %s:\n\n%s\n\n", "Call BasePlusCommissionEmployee's toString with subClass", 
		"reference to subClass object", basePlusCommissionEmployee.toString() );
		 
		System.out.printf("%s %s:\n\n%s\n\n", "Call CommissionEmployee's toString with superclass", 
		"reference to subClass object", basePlusCommissionEmployee.toString() );
	} // end main
} // end class PolymorphismTes