/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Using a JPanel to help lay out components.
 *User: Muh. Asrul Mulis
 *Date: 9/juli/2023
 *
 *Version(1.18)
 */ 
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

 public class PanelJframe extends JFrame {
     
	private JPanel buttonJPanel; // panel to hodld buttons
	private JButton[] buttons; // array of buttons
	 // no-argument constructor
	public PanelJframe() {
		 
		super( "Panel Demo" );
		buttons = new JButton[5];// create buttons array
		buttonJPanel = new JPanel(); // set up panel 
		buttonJPanel.setLayout( new GridLayout( 1, buttons.length ) );
		// create and add buttons
		for(int count = 0; count < buttons.length; count++) {
			 
			buttons[count] = new JButton( "Button" + ( count + 1 ) );
			buttonJPanel.add( buttons[count] ); // add buttons to panel
		} // end for
		// add panel to JFrame
		add( buttonJPanel, BorderLayout.SOUTH ); 
	} // end PanelJframe constructor
 } // end class PanelJframe