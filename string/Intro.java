package string;

public class Intro {

	public static void main(String[] args) {
		
		//creates new object of string
		String name = new String("Chinmay");
		String name2 = new String("Chinmay");
		
		//same string present? assigns old string : creates new string
		String name3 = "Chinmay";
		String name4 = "Chinmay";
		
		System.out.println(name == name2);
		System.out.println(name3 == name4);
		System.out.println(name == name3);
		System.out.println();
		
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.substring(4));
		System.out.println(name.substring(0, 4));
		System.out.println(name.contains("nm"));
		System.out.println(name.equals(name2));
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" Singhania"));
		System.out.println(name.replace("C", "c"));
		System.out.println();
		
		String colors = "red,green,blue";
		String allColors[] = colors.split(",");				//splits string at given char
		for(String color : allColors) {
			System.out.println(color);
		}
		System.out.println();
		
		System.out.println(name.indexOf("y"));				//returns index of given char
		System.out.println(name.toLowerCase());				//converts all letters to lower case
		System.out.println(name.toUpperCase());				//converts all letters to upper case
		String space = "   hello    ";
		System.out.println(space.trim()); 					//removes trailing and leading white spaces
		
	}

}