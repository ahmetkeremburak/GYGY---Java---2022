package sekiller;

public class Daire extends Sekil{
	private double yaricap;

	public double getYaricap() {
		return yaricap;
	}

	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}

	@Override
	public double getAlan() {
		return Math.PI * Math.pow(yaricap, 2);
	}

	@Override
	public double getCevre() {
		return 2 * Math.PI * yaricap;
	}
	
	
}
