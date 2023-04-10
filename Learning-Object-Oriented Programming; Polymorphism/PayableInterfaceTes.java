/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Tests interface Payable.
 *User: Muh. Asrul Mulis
 *Date: 10/April/2023
 *
 *Version(5.3)
 */
 
public class PayableInterfaceTes {
     
	public static void main( String[] args ) {
	     // create four-element Payable array
		Payable[] payableObjects = new Payable[4];
		 // populate array with objects that implement Payable
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee2("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] = new SalariedEmployee2("Lisa", "Barnes", "888-88-8888", 1200.00);
		 
		System.out.println("Invoices and Employees processed polymorphically:\n");
		 // generically process each element in array payableObjects
		for(Payable currentPayable : payableObjects) {
			 // output currentPayable and its appropriate payment amount
			System.out.printf("%s \n%s: $%,.2f\n\n", currentPayable.toString(), 
			"payment due", currentPayable.getPaymentAmount() ); 
		} // end for
	} // end main
} // end class PayableInterfaceTes