/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *BasePlusCommissionEmployee inherits protected instance variables from CommissionEmployee.
 *
 *User: Muh. Asrul Mulis
 *Date: 06/April/2023
 *
 *Version(2.3)
 */ 
 
public class BasePlusCommissionEmployee3 extends CommissionEmployee {
      
	protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSales; // gross weekly sales 
    protected double commissionRate; // commission percentage
	private double baseSalary; // base salary per week
	 // six-argument constructor
	public BasePlusCommissionEmployee3(String first, String last, String ssn, 
	double sales, double rate, double salary) {
		 
		super(first, last, ssn, sales, rate);
		 
		setBaseSalary(salary); // validate and store base salary
    } // end six-argument BasePlusCommissionEmployee constructor
	// set base salary
	public void setBaseSalary( double salary ) {
		 
		if(salary >= 0.0) 
			 
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
		 
		return baseSalary + ( commissionRate * grossSales );
	} // end method earnings
	// return String representation of BasePlusCommissionEmployee
	@Override // indicates that this method overrides a superclass method
	public String toString() {
		 
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
		"base-salaried commission employee", firstName, lastName, 
		"social security number", socialSecurityNumber, 
		"gross sales", grossSales, "commission rate", commissionRate, 
		"base salary", baseSalary);
	} // end method toString
} // end class BasePlusCommissionEmployee3