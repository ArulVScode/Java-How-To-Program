/*
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Test application that displays a smiley face.
 *Name User: Muh. Asrul Mulis
 *Date: 14/Maret/2023
 *
 *Version(0.7)
 */

import javax.swing.JFrame;

public class DrawSmileyTes {
	
   public static void main(String[] args) {
      DrawSmiley panel = new DrawSmiley();
	  JFrame aplikasi = new JFrame();
	  
	  aplikasi.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	  aplikasi.add( panel );
	  aplikasi.setSize( 230, 250 );
	  aplikasi.setVisible( true );
    } // end main
} // end class DrawSmileyTes