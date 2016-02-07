package Huiswerk;

import java.util.ArrayList;

public class Onderwijsmanager extends Werkgever {

	private ArrayList<Docent> docenten = new ArrayList<Docent>();
	private Secretaresse secretaresse;

	public Onderwijsmanager(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}
}