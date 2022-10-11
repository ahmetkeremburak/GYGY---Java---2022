import java.util.Scanner;

public class ReplaceMethod {

	public static void main(String[] args) {
		// This code is to replace all vowels in a string with appropriate numbers.
		//Starting from "A" with "1", "E" with "2", so on and so forth.
		Scanner scn = new Scanner(System.in);
		System.out.print("Adınızı bahşeder misiniz: ");
		String isim = scn.nextLine();
		isim = isim.replace( 'a', '1' );
		isim = isim.replace( 'e', '2' );
		isim = isim.replace( 'ı', '3' );
		isim = isim.replace( 'i', '4' );
		isim = isim.replace( 'o', '4' );
		isim = isim.replace('ö', '5');
		isim= isim.replace( 'u', '5' );
		System.out.println( isim );
	}
}


