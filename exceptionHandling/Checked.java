package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checked {

	public static void main(String[] args) {
		
		int i=4,j=1,k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter number: ");
			j=Integer.parseInt(br.readLine());
			k=i/j;
		}
		
		catch(IOException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Unknown Exception");
		}
		
		finally {
			System.out.println("Output: " + k);
			System.out.println("BYE");
		}
		
	}

}
