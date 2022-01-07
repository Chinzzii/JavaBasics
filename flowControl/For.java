package flowControl;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
	/*	
	 	*
		*	*
		*		*
		*			*
		*	*	*	*	*
	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		System.out.println("*");
		
		if(n>1) {
			for(int i=2; i<=n-1; i++) {
				System.out.print("*");
				
				for(int j=1; j<i; j++) {
					System.out.print("	");
				}
				
				System.out.println("*");
			}
			
			for(int k=1; k<=n; k++) {
				System.out.print("*	");
			}
		
		}
	}

}