/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Copying selected text from one textarea to another.
 *User: Muh. Asrul Mulis
 *Date: 11/juli/2023
 *
 *Version(1.19)
 */ 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

 public class TextAreaFrame extends JFrame {
      
	private JTextArea textArea1; // displays demo string
	private JTextArea textArea2; // highlighted text is copied here
	private JButton copyJButton; // initiates copying of text
	 // no-argument constructor
	public TextAreaFrame() {
		 
		super( "TextArea Demo" ); // create box
		Box box = Box.createHorizontalBox();
		String demo = "This is a demo string to\n" + "illustrate copying text\nfrom one textarea to \n"
		+ "another textarea using an\nexternal event\n";
		 
		textArea1 = new JTextArea( demo, 10, 15 ); // create textArea1
		box.add( new JScrollPane(textArea1) ); // add scroll pane
		 // create copy button
		copyJButton = new JButton("Copy >>>");
		box.add( copyJButton ); // add copy button to box
		 // anonymous inner class
		copyJButton.addActionListener( new ActionListener() {
			     // set text in textArea2 to selected text from textArea1
				public void actionPerformed( ActionEvent event ) {
					 
					textArea2.setText( textArea1.getSelectedText() );
				} // end method actionPerformed
			} // end anonymous inner class
		); // end call to addActionListener
		 
		textArea2 = new JTextArea( 10, 15 ); // create second textarea
		textArea2.setEditable( false ); // disable editing
		box.add( new JScrollPane(textArea2) ); // add ScrollPane
		 
		add( box ); // add box to frame
	} // end TextAreaFrame constructor
 } // end class TextAreaFrame