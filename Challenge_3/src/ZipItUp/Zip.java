package ZipItUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Zip {
	public static void main(String[] args) {
//		Get an input from user, lowercase then rearrange letters by herding same letters together
//		Abiding their appearance order, put each letter and their frequency in the input string to a new Arraylist
//		Write the list on the console by iterating over each element of the Arraylist
		String name = getUserInput();
		ArrayList<Character> zipped = new ArrayList<Character>();
		zipped = zipItUp(stickyFingers(name));
		writeOnConsole(zipped);
		
	}

	private static void writeOnConsole(ArrayList<Character> zipped) {
//		Arraylist variable (zipped) is iterated using an iterator object
//		Iterated elements are written on console 
		Iterator<Character> req = zipped.iterator();
		while(req.hasNext()) {
			System.out.print(req.next());
		}
	}

	private static ArrayList<Character> zipItUp(ArrayList<Character> parts) {
//		A for each loop is iterated over the Arraylist variable (parts)
//		If clause adds only one instance of every character to a new Arraylist(zipped)	
//		Right next to every character from the input, calculated number of their frequency is added
		ArrayList<Character> zipped = new ArrayList<Character>();
		for (Character character : parts) {
			if(!zipped.contains(character)) {
			zipped.add(character);
			zipped.add(zipped.indexOf(character) + 1, (char)((parts.lastIndexOf(character) - parts.indexOf(character) + 1) + '0'));
			}
		}
		return zipped;
	}
		
	private static ArrayList<Character> stickyFingers(String name) {
//		Lowercase the string input, for-loop each letter to put into an arraylist
//		Characters added to Arraylist in first instance order
//		As for-loop goes over characers, Recurrences are herded next to first occurrence by an if-else condition
		ArrayList<Character> parts = new ArrayList<Character>();
		name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (!parts.contains(name.charAt(i))) {
				parts.add(name.charAt(i));
			}
			else {
				parts.add(parts.indexOf(name.charAt(i)) + 1, name.charAt(i));
			}
		}	
		return parts;
		
	}

	private static String getUserInput() {
//		Get string input
		Scanner scn = new Scanner(System.in);
		System.out.print("Master, your name is: ");
		String name = scn.nextLine();
		scn.close();
		return name;
	}
}
