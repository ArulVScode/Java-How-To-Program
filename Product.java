/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Calculate the product of three integers.
 *
 *User: Muh. Asrul Mulis
 *Date: 20/February/2023
 *
 *Version(0.8)
 */
import java.util.Scanner;

//class name
public class Product {
    //main method begins execution of java aplication
   public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
		int a =1;
		int b =1;
		int c =1;
		int results =0;
		//Create Scanner to obtain input from in the Command Line
		System.out.print("Input Value = ");
		a = value.nextInt();
		System.out.print("Input Value = ");
		b = value.nextInt();
		System.out.print("Input Value = ");
		c = value.nextInt();
		results = a * b * c;
		System.out.printf("Product: %d\n", results );
    } //end method
} //end class Product