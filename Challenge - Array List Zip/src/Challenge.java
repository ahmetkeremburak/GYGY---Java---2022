import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		String name = getUserInput();
		
//		System.out.println(stickyFingers(name));
//		zipItUp(stickyFingers(name));
		System.out.println(zipItUp(stickyFingers(name)));
	}

	private static ArrayList<Character> zipItUp(ArrayList<Character> parts) {
		ArrayList<Character> zipped = new ArrayList<Character>();
		for (Character character : parts) {
			zipped.add(character);
			zipped.add(parts.indexOf(character) + 1, (char)(parts.lastIndexOf(character) - parts.indexOf(character) + 1));
			
		}
		return zipped;
	}

	private static ArrayList<Character> stickyFingers(String name) {
		ArrayList<Character> parts = new ArrayList<Character>();;
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
		Scanner scn = new Scanner(System.in);
		System.out.print("Master, your name is: ");
		String name = scn.nextLine();
		scn.close();
		return name;
	}
	
	

}
