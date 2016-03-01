package Huiswerk;

public abstract class Pizza {

	protected String naam;
	protected double prijs;

	public abstract String getNaam();
	public abstract void setNaam(String naam);
	public abstract double getPrijs();
	public abstract void setPrijs(double prijs);
}