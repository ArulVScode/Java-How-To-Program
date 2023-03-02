/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Using drawLine to connect the corners of a panel.
 *User: Muh. Asrul Mulis
 *Date: 02/Maret/2023
 *
 *Version(0.5)
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanels extends JPanel {
     // draws an X from the corners of the panel
	public void paintComponent( Graphics g ) {
	     // call paintComponent to ensure the panel displays correctly
		super.paintComponent( g );
		
		int width = getWidth(); // total width
		int height = getHeight(); // total height
		// draw a line from the upper-left to the lower-right
		g.drawLine( 0, 0, width, height );
		// draw a line from the lower-left to the upper-right
		g.drawLine( 0, height, width, 0 );
	} // end method paintComponent
} //end class DrawPanels