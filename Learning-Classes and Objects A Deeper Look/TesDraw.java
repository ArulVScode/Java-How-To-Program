/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAM
 *
 *Creating a JFrame to display a DrawPanel.
 *User: Muh. Asrul Mulis
 *Date: 03/April/2023
 *
 *Version(3.10)
 */
 
import javax.swing.JFrame;

public class TesDraw {
     
	public static void main(String[] args) {
	      
		DrawPanel panel = new DrawPanel();
		JFrame application = new JFrame();
		 
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add( panel );
		application.setSize( 300, 300 );
		application.setVisible( true );
	} // end main
} // end class TesDraw