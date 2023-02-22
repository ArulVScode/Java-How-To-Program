/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Multiplication Program that displays 2 numbers is added and then multiplited by number 
  and then the result is displayed
 *User: Muh. Asrul Mulis
 *Date: 20/February/2023
 *
 *Version(0.5)
 */
 
 import java.util.Scanner;
 
 //class name
 public class MultiplicationAddition {
    //main method begins execution of java aplication
	public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        //Storage Program
		int number1 = 1;
        int number2 = 1;
		int number3 = 1;
        int Sum = 0;
        //Create Scanner to obtain input from in the Command Window
		System.out.println("----------------------------");
        System.out.print("Enter Number1: "); //first number to add
        number1 = Enter.nextInt();
        System.out.print("Enter Number2: "); //secound number to add
        number2 = Enter.nextInt();
        System.out.print("Enter Number3: "); //And the third number to be multiplied
        number3 = Enter.nextInt();
        Sum = number1 + number2 * number3; //Sum of number1, number2, and number3
        System.out.printf("Sum is = %d\n", Sum ); //Display Sum
        System.out.println("----------------------------");		
	} //end to method
 } //end to class