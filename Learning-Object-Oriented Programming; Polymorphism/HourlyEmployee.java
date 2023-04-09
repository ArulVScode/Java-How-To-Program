/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *HourlyEmployee class extends Employee2.
 *User: Muh. Asrul Mulis
 *Date: 09/April/2023
 *
 *Version(3.2)
 */
 
public class HourlyEmployee extends Employee2 {
     
	private double wage; // wage per hour
	private double hours; // hours worked for week
	 // five-argument constructor
	public HourlyEmployee( String first, String last, String ssn, 
	double hourlyWage, double hoursWorked ) {
		 
		super( first, last, ssn );
		setWage( hourlyWage ); // validate hourly wage
		setHours( hoursWorked ); // validate hours worked
	} // end five-argument HourlyEmployee constructor
	// set wage
	public void setWage( double hourlyWage ) {
		 
		if( hourlyWage >= 0.0 ) 
			 
		    wage = hourlyWage;
		else 
			 
		    throw new IllegalArgumentException("Hourly wage must be >= 0.0");
	} // end method setWage
	// return wage
	public double getWage() {
		 
		return wage;
	} // end method getWage
	// set hours
	public void setHours( double hoursWorked ) {
		 
		if( (hoursWorked >= 0.0) && (hoursWorked <= 168.0) ) 
			 
		    hours = hoursWorked;
		else 
			 
		    throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
	} // end method setHours
	// return hours
	public double getHours() {
		 
		return hours;
	} // end method getHours
	@Override // calculate earnings; override abstract method earnings in Employee
	public double earnings() {
		 
		if( getHours() <= 40 ) // no overtime
			 
		    return getWage() * getHours();
		else 
			 
		    return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5; 
	} // end method earnings
	@Override // return String representation of HourlyEmployee object
	public String toString() {
		 
		return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
		super.toString(), "hourly wage", getWage(), 
		"hours worked", getHours() );
	} // end method toString
} // end class HourlyEmployee