/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Testing PaintPanel.
 *User: Muh. Asrul Mulis
 *Date: 9/Mei/2023
 *
 *Version(1.13)
 */  
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

 public class PaintPanel {
     
	public static void main(String[] args) {
	     // creat frame
		JFrame application = new JFrame("A simple paint program");
		 // creat paintPanelFrame
		PaintPanelFrame paintPanelFrame = new PaintPanelFrame();
		application.add( paintPanelFrame, BorderLayout.CENTER );
		 // create a label and place it in SOUTH of BorderLayout
		application.add( new JLabel("Drag the to draw"), BorderLayout.SOUTH );
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.setSize( 400, 200 ); // set size frame
		application.setVisible( true ); // display frame
	} // end main
 } // end class PainPanelTest