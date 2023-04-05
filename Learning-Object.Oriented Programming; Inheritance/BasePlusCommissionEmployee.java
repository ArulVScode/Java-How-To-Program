/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *BasePlusCommissionEmployee class represents an employee who receives a base salary in addition to commission.
 *
 *User: Muh. Asrul Mulis
 *Date: 05/April/2023
 *
 *Version(1.2)
 */

public class BasePlusCommissionEmployee {
     
	private String firstName;
	private String lastName;
	private String socialSecurtyNumber;
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	private double baseSalary; // base salary per week
	 // six-argument constructor
	public BasePlusCommissionEmployee( String first, String last, String ssn, 
	double sales, double rate, double salary ) {
	     // implicit call to Object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecurtyNumber = ssn;
		setGrossSales( sales ); // validate and store gross sales
		setCommissionRate( rate ); // validate and store commission rate
		setBaseSalary( salary ); // validate and store base salary
	} // end six-argument BasePlusCommissionEmployee constructor
	// set first name
	public void setFirstName( String first ) {
	      
		firstName = first; // should validate
	} // end method setFirstName
	// return first name
	public String getFirstName() {
	     
		return firstName;
	} // end method getFirstName
	// set last name
	public void setLastName( String last ) {
	     
		lastName = last; // should validate
	} // end method setLastName
	// return last name
	public String getLastName() {
	      
		return lastName;
	} // end method getLastName
	// set social security number
	public void setSocialSecurtyNumber( String ssn ) {
	       
		socialSecurtyNumber = ssn; // should validate
	} // end method setSocialSecurityNumber
	// return social security number
	public String getSocialSecurityNumber() {
	      
		return socialSecurtyNumber;
	} // end method getSocialSecurityNumber
	// set gross sales amount
	public void setGrossSales( double sales ) {
	     
		if( sales >= 0.0 ) 
		     
			grossSales = sales;
		else 
		     
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	} // end method setGrossSales
	// return gross sales amount
	public double getGrossSales() {
	     
		return grossSales;
	} // end method getGrossSales
	// set commission rate
	public void setCommissionRate( double rate ) {
	       
		if( rate >= 0.0 && rate < 1.0 ) 
		     
			commissionRate = rate;
		else 
		     
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	} // end method setCommissionRate
	// return commission rate
	public double getCommissionRate() {
	      
		return commissionRate;
	} // end method getCommissionRate
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
	public double earnings() {
	     
		return baseSalary + ( commissionRate * grossSales );
	} // end method calculate earnings
	// return String representation of BasePlusCommissionEmployee
	@Override // indicates that this method overrides a superclass method
	public String toString() {
	      
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
		"base-salaried commission employee", firstName, lastName, 
		"social securty number", socialSecurtyNumber, 
		"gross sales", grossSales, "commission rate", commissionRate, 
		"base salary", baseSalary );
	} // end method toString
} // end class BasePlusCommissionEmployee