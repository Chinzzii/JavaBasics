package flowControl;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=1;
		
		do {
			n=sc.nextInt();
			System.out.println("Number entered is: " + n);
		
			if(n==0) {
				System.out.println("Loop is terminated!");
			}
		}while(n!=0);
		
	}

}
