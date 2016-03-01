package Huiswerk;

public class Bolognese {

	private String naam = "Bolognese";
	private double prijs = 7.00;
	
	public Bolognese() {
		
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
