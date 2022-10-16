package oyun;

public class Wizard extends Karakter implements BuyuKullanabilir {

	public Wizard(String isim, int level, String irk, int hitPoint, int intelligence, int strength, int dexterity,
			String alignment) {
		//Karakterin oluşabilmesi için zorunlu olan özellikleri constructorda verilir ve super ile atanır.
		super(isim, level, irk, hitPoint, intelligence, strength, dexterity, alignment);
	}

	@Override
	public int saldir() {
		// karakterin özelliklerine göre saldırı metodu yazılmalı
		return 0;
	}

	@Override
	public String buyuKaynagı() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int buyuYap() {
		// TODO Auto-generated method stub
		return 0;
	}


}
