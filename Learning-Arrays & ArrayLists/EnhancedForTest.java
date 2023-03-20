/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Using the enhanced for statement to total integers in an array.
 *User: Muh. Asrul Mulis
 *Date: 20/Maret/2023
 *
 *Version(0.9)
 */

public class EnhancedForTest
{
   public static void main( String[] args )
   {
       int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
       int total = 0;

       // add each element's value to total
		for(int number : array)  
		    total += number;
              
                
             
      System.out.printf( "Total of array elements: %d\n", total );
    } // end main
} // end class EnhancedForTest