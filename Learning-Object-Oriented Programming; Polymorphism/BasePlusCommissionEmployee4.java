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
 *Version(5.2)
 */
 
public class BasePlusCommissionEmployee4 extends CommissionEmployee2 {
     
	private double baseSalary; // base salary per week
	 // six-argument constructor
	public BasePlusCommissionEmployee4( String first, String last, String ssn, 
	double sales, double rate, double salary ) {
		 
		super( first, last, ssn, sales, rate );
		setBaseSalary( salary ); // validate and store base salary
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
	@Override // calculate earnings; override method earnings in CommissionEmployee
	public double earnings() {
		 
		return getBaseSalary() + super.earnings();
	} // end method earnings
	@Override // return String representation of BasePlusCommissionEmployee object
	public String toString() {
		 
		return String.format("%s %s; %s: $%,.2f", 
		"base-salaried", super.toString(), 
		"base salary", getBaseSalary() );
	} // end method toString
} // end class BasePlusCommissionEmployee4