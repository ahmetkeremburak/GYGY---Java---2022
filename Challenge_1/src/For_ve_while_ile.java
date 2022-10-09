import java.util.Scanner;

public class For_ve_while_ile {

	public static void main(String[] args) {
		// This code is to replace all vowels in a string with appropriate numbers.
		//Starting from "A" with "1", "E" with "2", so on and so forth.
		Scanner scn = new Scanner(System.in);
		System.out.print("Adınızı bahşeder misiniz: ");
		String isim = scn.nextLine();
		isim = changing_vowels(isim);
		System.out.println(isim);
		scn.close();

	}

	public static String changing_vowels(String isim) {
		StringBuilder isim2 = new StringBuilder(isim);
		char[] harfler = {'a','A','e','E','ı','I','i','İ','o','O','ö','Ö','u','U','ü','Ü'};
		char[] numaralar = {'1','1','2','2','3','3','4','4','5','5','6','6','7','7','8','8'};
		int i = 0;
		while (i + 1 <= isim.length()) {
			for(int j = 0; j < harfler.length; j++) {
				if(isim.charAt(i) == harfler[j]) {
					isim2.setCharAt(i, numaralar[j]);
				}
				
			}
			i++;
		}
		return isim2.toString();
	}
}
