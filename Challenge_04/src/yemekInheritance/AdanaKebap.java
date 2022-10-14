package yemekInheritance;

public class AdanaKebap extends Kebap{
	private boolean aci;
	
	
	public boolean isAci() {
		return aci;
	}
	
	public void setAci(boolean aci) {
		if(aci == false) {
			System.out.println("Adana kebap acılı olur.");
		}
		this.aci = true;
		
	}
	
	public void lavasSar(boolean lavas) {
		if(lavas) setKaloriPorsiyon(getKaloriPorsiyon() + 185);
	}
}
	
	

