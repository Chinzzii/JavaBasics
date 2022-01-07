package string;

import java.util.Scanner;

public class AnagramOptimized {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isAnagram = true;
		String a,b;
		
		System.out.println("Enter first string: ");
		a = sc.nextLine();
		System.out.println("Enter second string: ");
		b = sc.nextLine();
		
		int list[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			System.out.println(index);
			list[index]++;
		}
		
		for(char c: b.toCharArray()) {
			int index = (int) c;
			list[index]--;
		}
		
		for(int i=0; i<256; i++) {
			if(list[i]!=0) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("Strings are Anagrams.");
		}
		else {
			System.out.println("Strings are not Anagrams.");
		}
	}

}
