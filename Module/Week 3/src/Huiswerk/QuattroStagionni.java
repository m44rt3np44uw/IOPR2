package Huiswerk;

public class QuattroStagionni extends Pizza {

	public QuattroStagionni() {
		this("Quattro Stagionni", 8.75);
	}

	public QuattroStagionni(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}


}
