/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Basic input with a dialog box.
 *User: Muh. Asrul Mulis
 *Date: 25/February/2023
 *
 *Version(0.5)
 */

import javax.swing.JOptionPane; // import class JOptionPane

public class NameDialog {
     
	public static void main(String[] args) {
	      // prompt user to enter name
		String name =
        JOptionPane.showInputDialog("What is your Name? ");
        // create the message
        String message =
        String.format("Welcome, %s, to Java Programming!", name );
        
		// display the message to welcome the user by name
        JOptionPane.showMessageDialog( null, message );		
	} //end main
} //end class NameDialog