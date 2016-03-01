package Werkcollege;

import java.util.ArrayList;
import Werkcollege.Opleiding;

public class Docent extends Werknemer {

	private ArrayList<Student> studenten = new ArrayList<Student>();
	private Opleiding opleiding;

	public Docent(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

	@Override
	public void werkt() {
		System.out.println(this.naam + " is een docent.");
	}
}