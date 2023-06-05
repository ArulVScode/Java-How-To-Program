/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Testing MouseTrackerFrame.
 *User: Muh. Asrul Mulis
 *Date: 5/Mei/2023
 *
 *Version(2.10)
 */  
import javax.swing.JFrame;

public class MouseTrackerTest {
     
	public static void main(String[] args) {
	     
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mouseTrackerFrame.setSize( 350, 100 ); // set size frame
		mouseTrackerFrame.setVisible( true ); // display frame
	} // end main
} // end class MouseTrackerTest