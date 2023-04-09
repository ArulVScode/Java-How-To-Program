/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Employee2 abstract superclass.
 *User: Muh. Asrul Mulis
 *Date: 09/April/2023
 *
 *Version(1.2)
 */
 
public abstract class Employee2 {
      
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	 // three-argument constructor
	public Employee2( String first, String last, String ssn ) {
		 
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	} // end three-argument Employee2 constructor
	// set firstName
	public void setFirstName( String first ) {
		 
		firstName = first; // should validate
	} // end method setFirstName
	// return first name
	public String getFirstName() {
		 
		return firstName;
	} // end method getFirstName
	// set lastName
	public void setLastName( String last ) {
		 
		lastName = last; // should validate
	} // end method setLastName
	// return last name
	public String getLastName() {
		 
		return lastName;
	} // end method getLastName
	// set socialSecurityNumber
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
	// abstract method overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
} // end abstract class Employee2