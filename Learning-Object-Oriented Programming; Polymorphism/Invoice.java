/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Invoice class that implements Payable.
 *User: Muh. Asrul Mulis
 *Date: 10/April/2023
 *
 *Version(2.3)
 */
 
public class Invoice implements Payable {
     
	private String partNumber;
	private String partDescription;
	private int quantity; 
	private double pricePerItem;
	 // four-argument constructor
	public Invoice( String part, String description, int count, double price ) {
	     
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	} // end four-argument Invoice constructor
	// set part number
	public void setPartNumber( String part ) {
		 
		partNumber = part; // should validate
	} // end method setPartNumber
	// return part number
	public String getPartNumber() {
		 
		return partNumber;
	} // end method getPartNumber
	// set description
	public void setPartDescription( String description ) {
		 
		partDescription = description; // should validate
	} // end method setPartDescription
	// return part description
	public String getPartDescription() {
		 
		return partDescription;
	} // end method getPartDescription
	// set quantity
	public void setQuantity( int count ) {
		 
		if(count >= 0) 
			 
		    quantity = count;
		else 
			 
		    throw new IllegalArgumentException("Quantity must be >= 0");
	} // end method setQuantity
	// return quantity
	public int getQuantity() {
		 
		return quantity;
	} // end method getQuantity
	// set price per item
	public void setPricePerItem( double price ) {
		 
		if(price >= 0.0) 
			 
		    pricePerItem = price;
	    else 
			 
		    throw new IllegalArgumentException("Price per item must be >= 0");
	} // end method setPricePerItem
	// return price per item
	public double getPricePerItem() {
		 
		return pricePerItem;
	} // end method getPricePerItem
	@Override // return String representation of Invoice object
	public String toString() {
		 
		return String.format("%s \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
		"invoice", "part number", getPartNumber(), getPartDescription(), 
		"quantity", getQuantity(), "price per item", getPricePerItem() );
	} // end method toString
	@Override // method required to carry out contract with interface Payable
	public double getPaymentAmount() {
		 
		return getQuantity() * getPricePerItem(); // calculate total cost
	} // end method getPaymentAmount
} // end class Invoice