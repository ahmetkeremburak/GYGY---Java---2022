import java.util.Scanner;

public class If_ve_Switch_Case {

	public static void main(String[] args) {
//		 This code is to replace all vowels in a string with appropriate numbers.
//		Starting from "A" with "1", "E" with "2", so on and so forth.
		Scanner scn = new Scanner(System.in);
		System.out.print("Adınızı bahşeder misiniz: ");
		String isim = scn.nextLine();
		String isim2 = changing_vowels(isim);
		System.out.println(isim2);
		scn.close();

	}

	private static String changing_vowels(String isim) {
//		For-loop iterates every character in given string variable
//		Switch-Case structure builds a new string according to given cases
//		StringBuilder object is transformed to String and returned.
		StringBuilder isim2 = new StringBuilder();
		for (int i = 0; i < isim.length(); i++) {
			switch (isim.charAt(i)) {
			case 'a':
				isim2.append(1);
				break;
				
			case 'A':
				isim2.append(1);
				break;
				
			case 'e':
				isim2.append(2);
				break;
				
			case 'E':
				isim2.append(2);
				break;
				
			case 'I':
				isim2.append(3);
				break;	
			
			case 'ı':
				isim2.append(3);
				break;
				
			case 'İ':
				isim2.append(4);
				break;
				
			case 'i':
				isim2.append(4);
				break;
				
			case 'O':
				isim2.append(5);
				break;
			
			case 'o':
				isim2.append(5);
				break;
				
			case 'ö':
				isim2.append(6);
				break;
				
			case 'Ö':
				isim2.append(6);
				break;
				
			case 'u':
				isim2.append(7);
				break;
				
			case 'U':
				isim2.append(7);
				break;
				
			case 'ü':
				isim2.append(8);
				break;
				
			case 'Ü':
				isim2.append(8);
				break;
				
			default:
				isim2.append(isim.charAt(i));
				break;
			}
		}
		return isim2.toString();
	}

}
