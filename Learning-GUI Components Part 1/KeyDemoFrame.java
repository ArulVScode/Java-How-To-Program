/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Demonstrating keystroke events.
 *User: Muh. Asrul Mulis
 *Date: 13/Mei/2023
 *
 *Version(1.14)
 */  
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

 public class KeyDemoFrame extends JFrame implements KeyListener {
     
	private String line1 = ""; // first line of textarea
	private String line2 = ""; // second line of textarea
	private String line3 = ""; // third line of textarea
	private JTextArea textArea; // textarea to display output
	 // KeyDemoFrame constructor
	public KeyDemoFrame() {
		 
		super( "Demonstrating Keystroke Events" );
		 
		textArea = new JTextArea( 10, 15 ); // set up JTextArea
		textArea.setText("Press any key on the keyboard..."); 
		textArea.setEnabled( false ); // disable textarea
		textArea.setDisabledTextColor( Color.BLACK ); // set text color
		add( textArea ); // add textarea to JFrame
		 // allow frame to process key events
		addKeyListener( this );
	} // end KeyDemoFrame constructor
	// handle press of any key
	public void keyPressed( KeyEvent event ) {
		 // show pressed key
		line1 = String.format("Key pressed: %s", event.getKeyText( event.getKeyCode() ) );
		setLines2and3( event ); // set output lines two and three
	} // end method keyPressed
	// handle released of any key
	public void keyReleased( KeyEvent event ) {
		 // show released key 
		line1 = String.format("Key released: %s", event.getKeyText( event.getKeyCode() ) );
		setLines2and3( event ); // set output lines two and three
	} // end method keyReleased
	// handle press of an action key
	public void keyTyped( KeyEvent event ) {
		 
		line1 = String.format("Key typed: %s", event.getKeyChar() );
		setLines2and3( event ); // set output lines two and three
	} // end method keyTypad
	// set second and third lines of output
	private void setLines2and3( KeyEvent event ) {
		 
		line2 = String.format("This key is %san action key", ( event.isActionKey() ? "" : "not " ) );
		String tmp = KeyEvent.getKeyModifiersText( event.getModifiers() );
		 // output modifiers
		line3 = String.format("Modifier keys pressed: %s", ( tmp.equals("") ? "none" : tmp ) ); 
		 // output three lines of text
		textArea.setText( String.format("%s\n%s\n%s\n", line1, line2, line3) );
	} // end method setLines2and3
 } // end class KeyDemoFrame