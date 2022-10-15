package yemekler;

public class Yemek {
	private float kaloriPorsiyon;
	private float porsiyon;
	private float toplamKalori;
	private boolean pişmiş;
	
	
	public void yenen(float miktar) {
		porsiyon -= miktar;
	}
	
	public float getToplamKalori() {
		if(kaloriPorsiyon > 0 && porsiyon > 0) {
		this.toplamKalori = kaloriPorsiyon * porsiyon; 
		}
		return toplamKalori;
	}
	
	public float getKaloriPorsiyon() {
		return kaloriPorsiyon;
	}
	
	public void setKaloriPorsiyon(float kaloriPorsiyon) {
		this.kaloriPorsiyon = kaloriPorsiyon;
	}
	
	public float getPorsiyon() {
		return porsiyon;
	}
	public void setPorsiyon(float porsiyon) {
		this.porsiyon = porsiyon;
		
	}
	public boolean isPişmiş() {
		return pişmiş;
	}
	public void setPişmiş(boolean pişmiş) {
		this.pişmiş = pişmiş;
	}
}
