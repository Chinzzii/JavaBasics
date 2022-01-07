package exceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserDefined {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter number: ");
			b=Integer.parseInt(br.readLine());
			if(a+b>10) {
				throw new MyException("Error");
			}
			System.out.println("Sum is less than or equal to 10");
		}
		
		catch(Exception e){
			System.out.println("Sum is greater than 10");
			System.out.println(e);		
		}
		
	}

}

class MyException extends Exception
{
	public MyException(String msg) {
		super(msg);
	}
}
