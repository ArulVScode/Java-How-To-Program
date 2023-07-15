/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Demonstrating Colors.
 *User: Muh. Asrul Mulis
 *Date: 15/Juli/2023
 *
 *Version(2.1)
 */
import javax.swing.JFrame;

 public class ShowColor {
     // execute application 
	public static void main(String[] args) {
		 // create frame for ColorJPanel
		JFrame frame = new JFrame( "Using Colors" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 
		ColorPanel colorPanel = new ColorPanel(); // create colorPanel
		frame.add(colorPanel); // add colorPanel JFrame
		frame.setSize(400, 180); // setSize frame 
		frame.setVisible(true); // display frame
	} // end main
 } // end class ShowColor