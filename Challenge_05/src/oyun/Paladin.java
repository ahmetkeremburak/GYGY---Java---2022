package oyun;

public class Paladin extends Karakter implements BuyuKullanabilir, ZirhGiyebilir, AskeriSilahKullanabilir {

	public Paladin(String isim, int level, String irk, int hitPoint, int intelligence, int strength, int dexterity,
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
	public void kilicKusan() {
		System.out.println("Belindeki kılıcı kavrar.");
		
	}

	@Override
	public int kilicSavur() {
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

	@Override
	public int zirhKusan() {
		// TODO Auto-generated method stub
		return 0;
	}

}
