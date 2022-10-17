package oyun;

public class Fighter extends Karakter implements ZirhGiyebilir, AskeriSilahKullanabilir{

	public Fighter(String isim, int level, String irk, int hitPoint, int intelligence, int strength, int dexterity,
			String alignment) {
		super(isim, level, irk, hitPoint, intelligence, strength, dexterity, alignment);
		
	}

	@Override
	public int saldir() {
		kilicSavur();
		return 0;
	}

	@Override
	public void kilicKusan() {
		System.out.println("Sırtından kılıcını çeker.");
	}

	@Override
	public int kilicSavur() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int zirhKusan() {
		// TODO Auto-generated method stub
		return 0;
	}


}
