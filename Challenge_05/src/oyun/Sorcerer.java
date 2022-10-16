package oyun;

public class Sorcerer extends Karakter implements BuyuKullanabilir {

	public Sorcerer(String isim, int level, String irk, int hitPoint, int intelligence, int strength, int dexterity,
			String alignment) {
		super(isim, level, irk, hitPoint, intelligence, strength, dexterity, alignment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int saldir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int buyuYap() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String buyuKaynagı() {
		// TODO Auto-generated method stub
		return null;
	}

}
