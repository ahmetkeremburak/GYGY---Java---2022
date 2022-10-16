package main.oyun;

import oyun.Karakter;
import oyun.Paladin;
import oyun.Wizard;

public class MainClass {

	public static void main(String[] args) {
		Wizard kerem = new Wizard("Kerem", 3, "Elf", 15, 10, 12, 10, "Chaotic Good");
		Karakter ahmet = (Paladin) new Paladin("Ahmet", 3, "İnsan", 12, 17, 8, 13, "Lawful Good");
		
		System.out.println(kerem.getIsim());
		System.out.println("Intelligence: " + kerem.getIntelligence());
		kerem.levelAtlama();
		System.out.println("Intelligence: " + kerem.getIntelligence());
		
		
	}

}
