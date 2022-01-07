package flowControl;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int temp;
		int lastDigit=0;
		int reverse=0;
		
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		temp=n;
		
		while(temp>0) {
			lastDigit = temp % 10;
			reverse = reverse*10 + lastDigit;
			temp = temp/ 10;
		}
		
		if(reverse==n) {
			System.out.println("It is a Palindorme!");
		}
		else {
			System.out.println("It is not a Palindrome!");
		}
	}

}
