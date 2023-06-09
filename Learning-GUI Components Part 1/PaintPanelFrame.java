/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Using class MouseMotionAdapter.
 *User: Muh. Asrul Mulis
 *Date: 9/Mei/2023
 *
 *Version(1.12)
 */  
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;
 
 public class PaintPanelFrame extends JPanel {
      
	private int pointCount = 0; // coint number of points
	private Point[] points = new Point[1000]; // array of 10000 java.awt.Point references
	 // set up GUI and register mouse event handler
	public PaintPanelFrame() {
		 // handle frame mouse motion event
		addMouseMotionListener( new MouseMotionAdapter() { // anonymous inner class
			 // store drag coordinates and repaint
			public void mouseDragged( MouseEvent event ) {
				 
				if( pointCount < points.length ) {
					 
					points[ pointCount ] = event.getPoint(); // find point
					++pointCount; // increment number of points in array
					repaint(); // JFrame repaint
				} // end if
			} // end method mouseDragged
		}); // end call to addMouseMotionListener
		    // end anonymous inner class private
	} // end PaintPanelFrame constructor
	// draw ovals in a 4-by-4 bounding box at specified locations on window
	public void paintComponent( Graphics g ) {
		 // clear draw area
		super.paintComponent( g );
		 // draw all points in array
		for(int i = 0; i < pointCount; i++)
			 
		    g.fillOval( points[i].x, points[i].y, 4, 4 );
	} // end method paintComponen
 } // end class PaintPanelFrame