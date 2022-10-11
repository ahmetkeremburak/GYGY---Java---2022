import java.util.Scanner;

public class ZipIt {
	public static void main(String[] args) {
		//String input from user is "zipped" to show consecutive letters and their number of frequency
		Scanner scn = new Scanner(System.in);
		System.out.print("Bir değişken alayım: ");
		String word = scn.nextLine();
		word = stickyFingers(word);
		System.out.println(word);
		scn.close();
	}

	//A for loop goes over each letter and counts the frequency of the letter
	//Then the letters and frequency is written to another string which the method returns
	private static String stickyFingers(String word) {
		StringBuilder wordZipped = new StringBuilder();
		int counter = 1;
		for (int i = 0; i < word.length(); i++) {
			if (i+1 < word.length() && word.charAt(i) == word.charAt(i+1)) {
				counter++;
			}
			else if(word.charAt(i) == ' '){
				wordZipped.append(' ');
				counter = 1;
			}
			else if(i+1 < word.length() && word.charAt(i) != word.charAt(i+1)) {
				wordZipped.append(word.charAt(i));
				wordZipped.append(counter);
				counter = 1;
			}
			else if(i+1 == word.length()) {
				wordZipped.append(word.charAt(i));
				wordZipped.append(counter);
			}
			}
		return wordZipped.toString();
		
	}
}
