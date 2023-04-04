/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *CommissionEmployee class represents an employee paid a percentage of gross sales.
 *
 *User: Muh. Asrul Mulis
 *Date: 04/April/2023
 *
 *Version(1.1)
 */
 
public class CommissionEmployee extends Object {
      
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	 // five-argument constructor
	public CommissionEmployee( String first, String last, String ssn, 
	double sales, double rate ) {
	     // implicit call to Object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales( sales ); // validate and store gross sales
		setCommissionRate( rate ); // validate and store commission rate
	} // end five-argument CommissionEmployee constructor
	// set first name
	public void setFirstName( String first ) {
	     
		firstName = first; // should validate
	} // end method setFirstName
	// retrun grossSales
	public String getFirstName() {
	     
		return firstName;
	} // end method getFirstName
	// set last name
	public void setLastName( String last ) {
	      
		lastName = last; // should validate
	} // end method setLastName
	// retrun lastName
	public String getLastName() {
	     
		return lastName;
	} // end method getLastName
	// set social security number
	public void setSocialSecurityNumber( String ssn ) {
	      
		socialSecurityNumber = ssn; // should validate
	} // end method setSocialSecurityNumber
	// return socialSecurityNumber
	public String getSocialSecurityNumber() {
	     
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber
	// set gross sales
	public void setGrossSales( double sales ) {
	      
		if(sales >= 0.0) 
			 
		    grossSales = sales;
		else
			 
		    throw new IllegalArgumentException("Gross sales must be >= 0.0");
	} // end method setGrossSales
	// retrun grossSales
	public double getGrossSales() {
	     
		return grossSales;
	} // end method getGrossSales
	// set commission rate
	public void setCommissionRate( double rate ) {
	       
		if(rate > 0.0 && rate < 1.0) 
			 
		    commissionRate = rate;
		else
			 
		    throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	} // end method setCommissionRate
	// return commission rate
	public double getCommissionRate() {
	       
		return commissionRate;
	} // end method getCommissionRate
	// calculate earnings
	public double earnings() {
	      
		return commissionRate * grossSales;
	} // end method earnings
	// return String representation of CommissionEmployee object
	@Override // indicates that this method overrides a superclass method
	public String toString() {
	     
		return String.format("%s: %s  %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
		"commission employee", firstName, lastName, 
		"social security number", socialSecurityNumber,
		"gross sales", grossSales, 
		"commission rate", commissionRate );
	} // end method toString
} // end class CommissionEmployee