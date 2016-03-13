package Werkcollege;

import java.io.Serializable;

public class Persoon implements Serializable {

	protected String naam;
	protected int leeftijd;
	protected double lengte;
	protected double gewicht;

	public Persoon(String naam, int leeftijd, double lengte, double gewicht) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.lengte = lengte;
		this.gewicht = gewicht;
	}
}