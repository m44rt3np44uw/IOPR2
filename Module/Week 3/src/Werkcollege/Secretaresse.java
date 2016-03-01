package Werkcollege;

public class Secretaresse extends Werknemer {

	public Secretaresse(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

	@Override
	public void werkt() {
		System.out.println(this.naam + " is een secretaresse.");
	}
}