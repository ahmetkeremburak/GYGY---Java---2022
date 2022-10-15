package sekiller;

public class dörtgen extends sekil {
	private double yükseklik;
	private double taban;
	private double kisaKenar;
	private double uzunKenar;
	
	public double getKisaKenar() {
		return kisaKenar;
	}

	public void setKisaKenar(double kisaKenar) {
		this.kisaKenar = kisaKenar;
	}

	public double getUzunKenar() {
		return uzunKenar;
	}

	public void setUzunKenar(double uzunKenar) {
		this.uzunKenar = uzunKenar;
	}

	public double getYükseklik() {
		return yükseklik;
	}

	public void setYükseklik(double yükseklik) {
		this.yükseklik = yükseklik;
	}

	public double getTaban() {
		return taban;
	}

	public void setTaban(double taban) {
		this.taban = taban;
	}

	@Override
	public double getAlan() {
		return yükseklik * taban;
	}

	@Override
	public double getCevre() {
		return (kisaKenar + uzunKenar) * 2;
	}

}
