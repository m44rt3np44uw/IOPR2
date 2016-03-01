package Huiswerk;

public class BigPizza extends Pizza {

	public BigPizza() {
		this("Big Pizza", 16.50);
	}

	public BigPizza(String naam, double prijs) {
		this.setNaam(naam);
		this.setPrijs(prijs);
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
}