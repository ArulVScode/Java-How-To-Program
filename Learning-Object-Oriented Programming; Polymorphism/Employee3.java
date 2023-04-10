/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Employee3 abstract superclass that implements Payable.
 *User: Muh. Asrul Mulis
 *Date: 10/April/2023
 *
 *Version(3.3)
 */
 
public abstract class Employee3 implements Payable {
     
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	 // three-argument constructor
	public Employee3( String first, String last, String ssn ) {
		 
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	} // end three-argument Employee3 constructor
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
	public void setSocialSecurityNumber( String ssn ) {
		 
		socialSecurityNumber = ssn; // should validate
	} // end method setSocialSecurityNumber
	// return social security number
	public String getSocialSecurityNumber() {
		 
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber
	@Override // return String representation of Employee object
	public String toString() {
		 
		return String.format("%s %s\nsocial security number: %s", 
		getFirstName(), getLastName(), getSocialSecurityNumber() );
	} // end method toString
	
	// Note: We do not implement Payable method getPaymentAmount here so
    // this class must be declared abstract to avoid a compilation error.
} // end class Employee3