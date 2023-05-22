/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Demonstrating the JTextField class.
 *User: Muh. Asrul Mulis
 *Date: 22/Mei/2023
 *
 *Version(1.3)
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {
     
	private JTextField textFieled1; // text field with set size
	private JTextField textFieled2; // text field constructed with text
	private JTextField textFieled3; // text field with text and size
	private JPasswordField passwoardField; // passwoard field with text
	 // TextFieldFrame constructor adds JTextFields to JFrame
	public TextFieldFrame() {
		 
		super("Testing JTextField and JPasswordField");
		setLayout( new FlowLayout() ); // set frame layout
		 // construct textfield with 10 columns
		textFieled1 = new JTextField(10);
		add( textFieled1 ); // add textFieled1 to JFrame
		 // construct textfield with default text
		textFieled2 = new JTextField("Enter text here");
		add( textFieled2 ); // add textFieled2 to JFrame
		 // construct textfield with default text and 21 columns
		textFieled3 = new JTextField( "Uneditable text field", 21 );
		textFieled3.setEditable( false ); // disable editing
		add( textFieled3 ); // add textFieled3 to JFrame
		 // construct passwordfield with default text
		passwoardField = new JPasswordField("Hidden text");
		add( passwoardField ); // add passwoardField to JFrame
		 // register event handlers
		TextFieldHandler handler = new TextFieldHandler();
		textFieled1.addActionListener( handler );
		textFieled2.addActionListener( handler );
		textFieled3.addActionListener( handler );
		passwoardField.addActionListener( handler );
	} // end TextFieldFrame constructor
	// private inner class for event handling
	private class TextFieldHandler implements ActionListener {
		 // process text field events
		public void actionPerformed( ActionEvent event ) {
			 
			String string = " "; // declare string to display
			 // user pressed Enter in JTextField textField1
			if(event.getSource() == textFieled1) 
				 
			    string = String.format( "textFieled1: %s", event.getActionCommand() );
			 // user pressed Enter in JTextField textField2    
			else if(event.getSource() == textFieled2) 
				 
			    string = String.format( "textFieled2: %s", event.getActionCommand() );
			 // user pressed Enter in JTextField textField3	 
			else if(event.getSource() == textFieled3) 
				 
			    string = String.format( "textFieled3: %s", event.getActionCommand() );
			 // user pressed Enter in JTextField passwordField	 
			else if(event.getSource() == passwoardField) 
				 
			    string = String.format( "passwoardField: %s", event.getActionCommand() );
			 // display JTextField content	
			JOptionPane.showMessageDialog( null, string );
		} // end method actionPerformed
	} // end private inner class TextFieldHandler
} // end class TextFieldFrame