package main;
import words.read.*;

public class Main {

	public static void main(String[] args) {
		String file = "C:\\Desktop\\file.txt";
		Reader rf = new Reader(file);
		
		
		System.out.println(rf.readWords());
		System.err.println(rf.readLineAtWithBuffer(0));
		
		
		

	}

}
