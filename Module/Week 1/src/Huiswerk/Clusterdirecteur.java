package Huiswerk;

public class Clusterdirecteur extends Werkgever {

	private Onderwijsmanager[] onderwijsmanagers = new Onderwijsmanager[4];
	private Secretaresse[] secretaresses = new Secretaresse[2];

	public Clusterdirecteur(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}
}