/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Application to display a DrawPanel.
 *User: Muh. Asrul Mulis
 *Date: 02/Maret/2023
 *
 *Version(0.5)
 */

import javax.swing.JFrame;

public class DrawPanelsTes {
     
	public static void main(String[] args) {
	     // create a panel that contains our drawing
	    DrawPanels panel = new DrawPanels();
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		application.add( panel ); // add the panel to the frame
		application.setSize( 250, 250 ); // set the size of the frame
		application.setVisible( true ); // make the frame visible
	} // end main
} // end class DrawPanelsTes