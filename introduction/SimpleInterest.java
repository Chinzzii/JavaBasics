package introduction;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		float interest, amount;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principle Amount: ");
		int principle = sc.nextInt();

		System.out.println("Enter time: ");
		byte time = sc.nextByte();

		System.out.println("Enter Rate of Interest: ");
		float rate = sc.nextFloat();

		interest = (principle * time * rate) / 100;
		amount = interest + principle;

		System.out.println("Interest after " + time + " years is: " + interest);
		System.out.println("Total amount after " + time + " years at " + rate + "% is: " + amount);

	}

}
