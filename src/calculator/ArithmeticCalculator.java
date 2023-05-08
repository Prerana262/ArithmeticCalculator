package calculator;
import java.util.Scanner;

public class ArithmeticCalculator {
public static void main(String[] args) {
		
		
		// stores 2 numbers
		int n1;
		int n2;
		int res;
		// take input from user
        Scanner sc = new Scanner(System.in);
        
        
		System.out.println("Enter the 1st no");
		System.out.println("Enter the 2nd no");
		
		// take inputs
		
		n1= sc.nextInt();
		n2= sc.nextInt();
		System.out.println("Enter your operator choice(+,-,*,/):");
		
		char choice=sc.next().charAt(0);
		sc.close();
		switch(choice)  {
		
		// add two numbers
		case '+':
			res=n1+n2;
			break;
		// substract two numbers
		case '-':
		res=n1-n2;
			break;
		// multipy two numbers
		case '*':
			res=n1*n2;
			break;
		// divide two numbers
		case '/':
			res=n1/n2;
			break;
		default:
			System.out.println("sorry, you enter wrong choice");
			return;
			
		}
		
		System.out.println("The result:");
		
		// The final result:
		System.out.println(n1 + " " + choice + " "+ n2 + " = " + res);
		

	}
	

}
	


