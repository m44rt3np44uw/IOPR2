package Werkcollege;

import java.util.ArrayList;

public class StudentInExamencommissie extends Student implements ExamencommissieLid {

	public StudentInExamencommissie(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

	@Override
	public void beoordeeltKlachten(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Boolean> beoordeeltCijfers(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void geeftAfGetuigenschrift(Student student) {
		// TODO Auto-generated method stub

	}
}