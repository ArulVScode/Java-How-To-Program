/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Demonstrating GridLayout.
 *User: Muh. Asrul Mulis
 *Date: 23/Mei/2023
 *
 *Version(1.17)
 */ 
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

 public class GridLayoutFrame extends JFrame implements ActionListener {
     
	private  JButton[] buttons; // array of buttons  
	private static final String[] names = { "One", "Two", "Three", "Four", "Five", "Six" };
	private boolean toggle = true; // toggle between two layouts
	private Container container; // frame container
	private GridLayout gridLayout1; // first gridLayout
	private GridLayout gridLayout2; // second gridlayout
	 // no-argument constructor
	public GridLayoutFrame() {
		 
		super( "GridLayout Demo" );
		gridLayout1 = new GridLayout( 2, 3, 5, 5 ); // 2 by 3; gaps of 5
		gridLayout2 = new GridLayout( 3, 2 ); // 3 by 2; no gaps
		container = getContentPane(); // get content pane
		setLayout( gridLayout1 ); // set JFrame layout
		buttons = new JButton[ names.length ]; // create array of JButtons
		 
		for(int count = 0; count < names.length; count++) {
			 
			buttons[count] = new JButton( names[count] );
			buttons[count].addActionListener( this ); // register listener
			add( buttons[count] ); // add buttons to JFrame
		} // end for
	} // end GridLayoutFrame constructor
	// handle button events by toggling between layouts
	public void actionPerformed( ActionEvent event ) {
				 
		if( toggle ) 
			 // set layout to second
			container.setLayout( gridLayout2 ); 
		else 
			 // set layout to first
			container.setLayout( gridLayout1 ); 
		toggle = !toggle; // set toggle to opposite value
		container.validate(); // re-lay out container
	} // end method actionPerformed
 } // end class GridBagLayoutFrame