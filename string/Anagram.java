package string;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a,b;
		
		System.out.println("Enter first string: ");
		a = sc.nextLine();
		System.out.println("Enter second string: ");
		b = sc.nextLine();
		
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
		
		if(a.length() == b.length()) {
			
			for(int i=0; i<a.length(); i++) {
				char c = a.charAt(i);
				isAnagram=false;
				for(int j=0; j<b.length(); j++) {
					if(c == b.charAt(j) && !visited[j]) {
						visited[j]=true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
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
