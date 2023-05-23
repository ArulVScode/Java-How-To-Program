/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Creating JButtons.
 *User: Muh. Asrul Mulis
 *Date: 23/Mei/2023
 *
 *Version(1.4)
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
 
public class ButtonFrame extends JFrame {
      
	private JButton plainJButton; // button with just text
	private JButton fancyJButton; // button with icon
	 // ButtonFrame adds JButtons to JFrame
	public ButtonFrame() {
		 
		super( "Testing Buttons" );
		setLayout( new FlowLayout() ); // set frame layout
		 // button with text
		plainJButton = new JButton("Plain Button");
		add( plainJButton ); // add plainJButton to JFrame
		 
		Icon bug1 = new ImageIcon( getClass().getResource( "f05ac3b19953bee858f90d2529a0cf9d.gif" ) );
		Icon bug2 = new ImageIcon( getClass().getResource( "images (1).gif" ) );
		fancyJButton = new JButton( "Fancy Button", bug1 ); // set image
		fancyJButton.setRolloverIcon( bug2 ); // set rollover image
		add( fancyJButton ); // add fancyJButton to JFrame
		 // create new ButtonHandler for button event handling
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener( handler );
		plainJButton.addActionListener( handler );
	} // end ButtonFrame constructor
	// inner class for button event handling
	private class ButtonHandler implements ActionListener {
		 // handle button event
		public void actionPerformed( ActionEvent event ) {
			 
			JOptionPane.showMessageDialog( ButtonFrame.this, String.format
			("You Pressed %s", event.getActionCommand() ) );
		} // end method actionPerformed
	} // end private inner class ButtonHandler
} // end class ButtonFrame