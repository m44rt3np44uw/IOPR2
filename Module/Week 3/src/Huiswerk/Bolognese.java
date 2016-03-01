package Huiswerk;

public class Bolognese extends Pizza {

	public Bolognese() {
		this("Bolognese", 7.00);
	}

	public Bolognese(String naam, double prijs) {
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
