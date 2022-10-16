package oyun;

import java.util.Scanner;

public abstract class Karakter {
	
	private String isim;
	private int level;
	private String irk;
	private int hitPoint;
	private int intelligence;
	private int strength;
	private int dexterity;
	private String alignment;
	
	public Karakter(String isim, int level, String irk, int hitPoint, int intelligence, int strength, int dexterity, String alignment) {
//		Karakterlerin bu özellikleri olmadan karakter olamazlar.
		this.isim = isim;
		this.level = level;
		this.irk = irk;
		this.hitPoint = hitPoint;
		this.intelligence = intelligence;
		this.strength = strength;
		this.dexterity = dexterity;
		this.alignment = alignment;
	}
	
//	Her karakter saldırır fakat saldırıları farklı olabilir.
	public abstract int saldir();
	
	public void potion() {
//		Karakterin hit pointine 3 ekler
		this.hitPoint += 3;
	};
	
	public void levelAtlama() {
//		Karakter levelini 1 arttırır ve istenilen stat puanına 1 ekler.
		this.level++;
		Scanner scn = new Scanner(System.in);
		System.out.println("Seviye atladın. Tebrikler!");
		System.out.println("Yeni seviyen " + this.level);
		System.out.print("Hangi statı arttıracaksın? ");
		
		
		int kanarya = 0;
		while (kanarya == 0) {
			String stat = scn.nextLine().toLowerCase();
			switch (stat) {
				case "intelligence":
					this.intelligence++;
					kanarya++;
					break;
					
				case "strenth":
					this.strength++;
					kanarya++;
					break;
					
				case "dexterity":
					this.dexterity++;
					kanarya++;
					break;
			default:
				System.out.println("Intelligence, Strength veya Dexterity seçmelisin.");
				break;
				}
		}
		scn.close();
	}

	public String getIsim() {
		return isim;
	}

	public int getLevel() {
		return level;
	}

	public String getIrk() {
		return irk;
	}

	public int getHitPoint() {
		return hitPoint;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public String getAlignment() {
		return alignment;
	}
	
	
	
	
}
