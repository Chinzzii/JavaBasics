package array;
import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows: ");
		int row = sc.nextInt();
		System.out.println("Enter Number of Columns: ");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		
		System.out.println("Enter First Matrix: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("First Matrix is:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(a[i][j] + "	");
			}
			System.out.println();
		}
		System.out.println("Second Matrix is:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(b[i][j] + "	");
			}
			System.out.println();
		}
		
		
		int c[][] = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Addition of the Two Matrices is: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(c[i][j] + "	");
			}
			System.out.println();
		}
		
	}

}
