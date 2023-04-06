/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *private superclass members cannot be accessed in a subclass.
 *
 *User: Muh. Asrul Mulis
 *Date: 06/April/2023
 *
 *Version(1.3)
 */ 
 
public class BasePlusCommissionEmployee2 extends CommissionEmployee {
     
	private double baseSalary; // base salary per week
	 // six-argument constructor
	public BasePlusCommissionEmployee2( String first, String last, String ssn, 
	double sales, double rate, double salary ) {
	     // explicit call to superclass CommissionEmployee constructor
		super( first, last, ssn, sales, rate );
		 
		setBaseSalary(salary); // validate and store base salary
	} // end six-argument BasePlusCommissionEmployee constructor
	// set base salary
	public void setBaseSalary( double salary ) {
	       
		if( salary >= 0.0 ) 
		     
			baseSalary = salary;
		else
		     
			throw new IllegalArgumentException("Base salary must be >= 0.0");
	} // end method setBaseSalary
	// return base salary
	public double getBaseSalary() {
	      
		return baseSalary;
	} // end method getBaseSalary
	// calculate earnings
	@Override // indicates that this method overrides a superclass method
	public double earnings() {
	     // not allowed: commissionRate and grossSales private in superclass
		return baseSalary + ( commissionRate * grossSales );
	} // end method earnings
	// return String representation of BasePlusCommissionEmployee
	@Override // indicates that this method overrides a superclass method
	public String toString() {
	     // not allowed: attempts to access private superclass members
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
		"base-salaried commission employee", firstName, lastName,
		"social securty number", socialSecurityNumber,
		"gross sales", grossSales, "commission rate", commissionRate, 
		"base salary", baseSalary );
	} // end method toString
} // end class BasePlusCommissionEmployee