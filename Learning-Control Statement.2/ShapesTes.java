/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Test application that displays class Shapes.
 *User: Muh. Asrul Mulis
 *Date: 08/Maret/2023
 *
 *Version(0.10)
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTes {
     
	public static void main(String[] args ) {
	      // obtain user's choice
		String input = JOptionPane.showInputDialog("Enter 1 to draw Rectangles" + "Enter 2 to draw Oval");
		
		int choice = Integer.parseInt( input ); // convert input to int
		// create the panel with the user's input
		Shapes Panel = new Shapes( choice );
		
		JFrame application = new JFrame(); // creates a new JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add( Panel ); // add the panel to the frame
		application.setSize(300, 300); // set the desired size
		application.setVisible( true ); // show the frame
	} // end main
} // end class ShapesTes