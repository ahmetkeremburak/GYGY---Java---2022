package zipItUp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ZipMap {

	public static void main(String[] args) {
		String name = getUserInput();
		LinkedHashMap<String, Integer> ziplist = new LinkedHashMap<String, Integer>();
		ziplist = zipThem(name);
		printZipList(ziplist);
	}
	

	private static void printZipList(LinkedHashMap<String, Integer> ziplist) {
//		Print keys and their value in LinkedHashMap order
		for (Map.Entry<String, Integer> entry : ziplist.entrySet()) {
			System.out.print(entry.getKey()+entry.getValue());	
		}	
	}


	private static LinkedHashMap<String, Integer> zipThem(String name) {
//		For-loop goes over every character in the given string
//		If-else condition puts the first instance of every character into LinkedHashMap as a key with value of 1
//		Recurrences of every character only increases the value of the key put before
		LinkedHashMap<String, Integer> ziplist = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < name.length(); i++) {
			if (ziplist.containsKey((name.charAt(i) +"").toLowerCase())) {
				
					ziplist.put(((name.charAt(i) +"").toLowerCase()), ziplist.get((name.charAt(i) +"").toLowerCase()) + 1 );
			}
			else {
					
				ziplist.put(((name.charAt(i) +"").toLowerCase()), 1);
			}
				
		}
		return ziplist;
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
