/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *CommissionEmployee2 class extends Employee2.
 *User: Muh. Asrul Mulis
 *Date: 09/April/2023
 *
 *Version(4.2)
 */
 
public class CommissionEmployee2 extends Employee2 {
     
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	 // five-argument constructor
	public CommissionEmployee2( String first, String last, String ssn, 
	double sales, double rate ) {
		 
		super( first, last, ssn );
		setGrossSales( sales );
		setCommissionRate( rate );
	} // end five-argument CommissionEmployee constructor
	// commission rate
	public void setCommissionRate( double rate ) {
		 
		if( rate > 0.0 && rate < 1.0 ) 
			 
		    commissionRate = rate;
		else 
			 
		    throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	} // end method setCommissionRate
	// return commission rate
	public double getCommissionRate() {
		 
		return commissionRate;
	} // end method getCommissionRate
	// set gross sales
	public void setGrossSales( double sales ) {
		 
		if( sales >= 0.0 ) 
			  
		    grossSales = sales;
		else 
			 
		    throw new IllegalArgumentException("Gross sales must be >= 0.0");
	} // end method setGrossSales
	// return gross sales
	public double getGrossSales() {
		 
		return grossSales;
	} // end method getGrossSales
	@Override // end five-argument CommissionEmployee constructor
	public double earnings() {
		 
		return getCommissionRate() * getGrossSales();
	} // end method earnings
	@Override // return String representation of CommissionEmployee object
	public String toString() {
		 
		return String.format("%s: %s\n%s: $%,.2f; %s: %,.2f", 
		"commission employee", super.toString(), 
		"gross sales", getGrossSales(), 
		"commission rate", getCommissionRate() );
	} // end method toString
} // end class CommissionEmployee2