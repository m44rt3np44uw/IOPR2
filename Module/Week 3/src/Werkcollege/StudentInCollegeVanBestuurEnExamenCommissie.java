package Werkcollege;

import java.util.ArrayList;

public class StudentInCollegeVanBestuurEnExamenCommissie extends Student implements Collegelid, ExamencommissieLid {

	public StudentInCollegeVanBestuurEnExamenCommissie(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
		// TODO Auto-generated constructor stub
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

	@Override
	public boolean neemtAanNieuweMedewerker(Persoon persoon) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bewaaktKwaliteit(Opleiding opleiding) {
		// TODO Auto-generated method stub
		return false;
	}

}
