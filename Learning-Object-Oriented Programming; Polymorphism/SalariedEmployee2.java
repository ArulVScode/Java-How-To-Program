/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *SalariedEmployee class extends Employee3, which implements Payable.
 *User: Muh. Asrul Mulis
 *Date: 10/April/2023
 *
 *Version(4.3)
 */
 
public class SalariedEmployee2 extends Employee3 {
     
	private double weeklySalary;
	 // four-argument constructor
	public SalariedEmployee2( String first, String last, String ssn, 
	double salary ) {
	     
		super( first, last, ssn ); // pass to Employee constructor
		setWeeklySalary( salary ); // validate and store salary
	} // end four-argument SalariedEmployee2 constructor
	// set weekly salary
	public void setWeeklySalary( double salary ) {
		 
		if(salary >= 0.0) 
			 
		    weeklySalary = salary;
		else 
			 
		    throw new IllegalArgumentException("Weekly salary must be >= 0.0");
	} // end method setWeeklySalary 
	// return weekly salary
	public double getWeeklySalary() {
		 
		return weeklySalary;
	} // end method getWeeklySalary
	@Override // calculate earnings; implement interface Payable method that was
    // abstract in superclass Employee
	public double getPaymentAmount() {
		 
		return getWeeklySalary();
	} // end method getPaymentAmount
	@Override // return String representation of SalariedEmployee object
	public String toString() {
		 
		return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), 
		"weekly salary", getWeeklySalary() );
	} // end method toString
} // end class SalariedEmployee2