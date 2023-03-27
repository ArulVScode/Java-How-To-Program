/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Test application to display a rainbow.
 *User: Muh. Asrul Mulis
 *Date: 27/Maret/2023
 *
 *Version(2.18)
 */
 
import javax.swing.JFrame;
 
public class DrawRainbowTes {
     
	public static void main(String[] args ) {
	       
		DrawRainbow panel = new DrawRainbow();
		JFrame application = new JFrame();
		 
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);
	} // end main
} // end class DrawRainbowTes