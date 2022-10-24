package words.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
// Every instance of Reader class requires a file path to be given, so not to ask for it for every method.
private String file;
	
	public Reader(String file) {
		this.file = file;
	}
	
//	Reads every word of a text file into an ArrayList
	public ArrayList<String> readWords() {
		ArrayList<String> words = new ArrayList<>();

	    try (Scanner scan = new Scanner(new File(file))) {
	        while (scan.hasNext()) {
	            words.add(scan.next());
	        }
	    } catch (Exception e) {
	        System.out.printf("Caught Exception: %s%n", e.getMessage());
	        e.printStackTrace();
	    }
	    return words;
	}

//	Returns the line at the specified number
	public String readLineAtWithBuffer(int lineNo) {
		String lineDesired = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i = 0; i < lineNo; i++) {
				br.readLine();
			}
			lineDesired = br.readLine();
			br.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lineDesired;
	}
	
//	Return the number of total lines
	public int numberOfTotalLines() {
		int total = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return total;
	}
	
}

