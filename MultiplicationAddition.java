/* 
 *ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *JAVA HOW TO PROGRAMM
 *
 *Display multiple lines with method System.out.printf
 *
 *User: Muh. Asrul Mulis
 *Date: 20/February/2023
 *
 *Version(0.5)
 */
 
 import java.util.Scanner;
 
 //class name
 public class MultiplicationAddition {
    
	public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        int number1 = 1;
        int number2 = 1;
		int number3 = 1;
        int Sum = 0;
        
		System.out.println("----------------------------");
        System.out.print("Enter Number1: ");
        number1 = Enter.nextInt();
        System.out.print("Enter Number2: ");
        number2 = Enter.nextInt();
        System.out.print("Enter Number3: ");
        number3 = Enter.nextInt();
        Sum = number1 + number2 * number3;
        System.out.printf("Sum is = %d\n", Sum );
        System.out.println("----------------------------");		
	}
 } 