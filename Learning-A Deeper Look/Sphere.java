/*
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Calculate the volume of a sphere.
 *Name User: Muh. Asrul Mulis
 *Date: 15/Maret/2023
 *
 *Version(0.9)
 */
 
 import java.util.Scanner;
 
 public class Sphere {
     // obtain radius from user and display volume of sphere
	public static void main(String[] args ) {
	      
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Enter Radius of Sphere: ");
		double radius = enter.nextDouble();
		
		System.out.printf("Volume is %f\n", sphereVolume( radius ) );
	} // end method determine sphereVolume
	// calculate and return sphere volume
	public static double sphereVolume( double radius ) {
	       
		double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
		return volume;
	} // end method sphereVolume
 } // end class Sphere