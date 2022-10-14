package main;

import yemekInheritance.AdanaKebap;

public class Main {

	public static void main(String[] args) {
		AdanaKebap kbp = new AdanaKebap();
		kbp.setAci(true);
		kbp.setEt("koyun");
		kbp.setKaloriPorsiyon(360);
		kbp.setPorsiyon(1.5f);
		kbp.setPişmiş(true);
		kbp.setSis(true);
		System.out.println("Bu tabak " + kbp.getToplamKalori() + " kalori. Afiyet olsun.");

	}

}
