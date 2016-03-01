package Huiswerk;

public class Calzone {

	private String naam = "Calzone";
	private double prijs = 6.50;

	public Calzone() {

	}

	public Calzone(String naam, double prijs) {
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
