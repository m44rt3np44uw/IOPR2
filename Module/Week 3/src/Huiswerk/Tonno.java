package Huiswerk;

public class Tonno extends Pizza implements Deliverable {

	public Tonno() {
		this("Tonno", 10.50);
	}

	public Tonno(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
	}

	public Tonno(String naam, double prijs, String bezorgAdres) {
		this.setNaam(naam);
		this.setPrijs(prijs);
		this.setBezorgAdres(bezorgAdres);
	}

	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public double getPrijs() {
		return prijs;
	}

	@Override
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	@Override
	public String getBezorgAdres() {
		return this.bezorgAdres;
	}

	@Override
	public void setBezorgAdres(String bezorgAdres) {
		this.bezorgAdres = bezorgAdres;
	}
}