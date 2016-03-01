package Werkcollege;

public class OnderwijsManagerCollegeVanBestuur extends Onderwijsmanager implements Collegelid {

	public OnderwijsManagerCollegeVanBestuur(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
		// TODO Auto-generated constructor stub
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