/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Generic ArrayList<T> collection demonstration.
 *User: Muh. Asrul Mulis
 *Date: 26/Maret/2023
 *
 *Version(0.17)
 */
 
 import java.util.ArrayList; 
 
public class ArrayListColections {
     
    public static void main(String[] args ) {
	     // create a new ArrayList of Strings with an initial capacity of 10
		ArrayList<String> items = new ArrayList<String>();
		 
		items.add("Red"); // append an item to the list
		items.add(0, "Yelow"); // insert the value at index 0
		 // header
		System.out.print("Display list contents with counter-controlled loop: ");
		 // display the colors in the list
		for(int i =0; i < items.size(); i++) 
		     
			System.out.printf(" %s", items.get(i) );
		 // display colors using foreach in the display method	 
		display(items, "\nDisplay list contents with enhanced for statement: "); 
		 
		items.add("Green"); // add "green" to the end of the list
		items.add("Yelow"); // add "yelow" to the end of the list
		 
		display(items, "List with to new elements: ");
		 
		items.remove("Yelow"); // remove the first "yellow
		display(items, "Remove firs intence of Yelow: ");
		 
		items.remove(1); // remove item at index 1
		display(items, "Remove second list element (green): ");
		 // check if a value is in the List
		System.out.printf("\"Red\" is %sin the list\n", 
		items.contains("Red") ? "": "not" );
		 // display number of elements in the List
		System.out.printf("Size: %s\n", items.size() );
	} // end main
	// display the ArrayList's elements on the console
	public static void display(ArrayList<String>items, String header) {
	      
		System.out.print(header); // display header
		 // display each element in items
		for(String item : items) 
		     
			System.out.printf(" %s", item );
		     
		System.out.println(); // display end of line
	} // end method display
} // end class ArrayListColections