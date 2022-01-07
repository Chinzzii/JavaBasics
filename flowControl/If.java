package flowControl;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		
		if(a > b) {
			if(a > c) {
				System.out.println("Greatest number is: " + a);
			}
			else {
				System.out.println("Greatest number is: " + c);
			}
		}
		else {
			if(b > c) {
				System.out.println("Greatest number is: " + b);
			}
			else {
				System.out.println("Greatest number is: " + c);
			}
		}
		
		int result = a>b? a>c? a:c : b>c? b:c;
		System.out.println("Greatest number is (using single line code): " + result);
		
	}
}
