/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Package-access members of a class are accessible by other classes in the same package.
 *User: Muh. Asrul Mulis
 *Date: 03/April/2023
 *
 *Version(0.09)
 */
 
public class PackageDataTes {
       
	public static void main(String[] args ) {
	     
		PackageData packageData = new PackageData();
		 // output String representation of packageData
		System.out.printf("After Instantiation: \n%s\n", packageData );
		 // change package access data in packageData object
		packageData.number = 77;
		packageData.string = "Goodbye";
		 // output String representation of packageData
		System.out.printf("\nAfter changing values: \n%s\n", packageData );
	} // end main
} // end class PackageDataTes
// class with package access instance variables
class PackageData {
     
	int number; // package-access instance variable
	String string; // package-access instance variable
	 // contructor
	public PackageData() {
	     
		number = 0;
		string = "Hello";
	} // end PackageData contructor
	// return PackageData object String representation
	public String toString() {
		 
		return String.format("number: %d; string: %s", number, string );
	} // end method toString
} // end class PackageData