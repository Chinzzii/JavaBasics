package flowControl;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		float result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first operand: ");
		float a = sc.nextFloat();
		
		System.out.println("Enter second operand: ");
		float b = sc.nextFloat();
		
		System.out.println("Enter operator: ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		
		switch(op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		case '%':
			result = a % b;
			break;
		default:
			System.out.println("Invalid Operation");
		}
		
		System.out.println("Result is: " + result);
		
	}
	
}