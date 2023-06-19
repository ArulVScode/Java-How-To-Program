/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Testing FlowLayoutFrame.
 *User: Muh. Asrul Mulis
 *Date: 19/Mei/2023
 *
 *Version(1.16)
 */  
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

 public class BorderLayoutFrame extends JFrame implements ActionListener {
     
	private JButton[] buttons; // array of buttons to hide portions
	private static final String[] names = { "Hide North", "Hide South", "Hide East", 
	"Hide West", "Hide Center" }; // Borde layout object
	private BorderLayout layout;
	 // set up GUI and event handling
	public BorderLayoutFrame() {
		 
		super( "BorderLayout Demo" );
		 
		layout = new BorderLayout( 5, 5 ); // 5 pixel gaps
		setLayout( layout ); // set frame layout
		buttons = new JButton[ names.length ]; // set size from array
		 // create JButtons and register listeners for them
		for(int count = 0; count < names.length; count++) {
			 
			buttons[ count ] = new JButton( names[ count ] );
			buttons[ count ].addActionListener( this );
		} // end BorderLayoutFrame constructor
		
		add( buttons[0], BorderLayout.NORTH ); // add button to north
		add( buttons[1], BorderLayout.SOUTH ); // add button to south
		add( buttons[2], BorderLayout.EAST ); // add button to east
		add( buttons[3], BorderLayout.WEST ); // add button to west
		add( buttons[4], BorderLayout.CENTER ); // add button to center
	} // end BorderLayoutFrame constructor
	// handle button event
	public void actionPerformed( ActionEvent event ) {
		 // check event source and lay out content pane correspondingly
		for( JButton button : buttons) {
			 // hide button clicked
			if(event.getSource() == button )
				button.setVisible( false );
			else
				button.setVisible( true ); // show other buttons
		} // end for
		// lay out content pane
		layout.layoutContainer( getContentPane() );
	} // end method actionPerformed
 } // end class BordeLayoutFrame