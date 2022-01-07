package practice;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	/*	


	 	*	*	*	*	*
	 			*	*	*	*
	 					*	*	*
	 							*	*
	 									*
	 									
	 							
	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		for(int l=1; l<=n; l++) {
			System.out.print("*	");
		}
		System.out.println();
		for(int i=1; i<=(n-1); i++) {
			for(int j=2; j<=i*2; j=j+2) {
				System.out.print("		");
			}
			for(int k=n-1; k>=i; k--) {
				System.out.print("*	");
			}
			System.out.println();
		}

	}

}
