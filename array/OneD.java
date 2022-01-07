package array;
import java.util.Scanner;

public class OneD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Students: ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		int sum = 0;
		float avg = 0;
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Marks for roll number " + i + ":");
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}
		
		avg = sum / n;
		
		System.out.println("Average Marks for Class is: " + avg);
		
	}

}
