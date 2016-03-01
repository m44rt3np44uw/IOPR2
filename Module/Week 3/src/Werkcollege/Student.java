package Werkcollege;

public class Student extends Persoon {

	public Student(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

	@Override
	public void werkt() {
		System.out.println(this.naam + " is een student.");
	}
}