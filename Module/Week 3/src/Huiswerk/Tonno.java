package Huiswerk;

public class Tonno {

	private String naam = "Tonno";
	private double prijs = 10.50;

	public Tonno() {

	}

	public Tonno(String naam, double prijs) {
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
