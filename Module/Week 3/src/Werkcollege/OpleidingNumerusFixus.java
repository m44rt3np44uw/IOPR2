package Werkcollege;

public class OpleidingNumerusFixus extends Opleiding implements NumerusFixus {

	public OpleidingNumerusFixus(String naam, String plaats) {
		super(naam, plaats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean laatToeStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean geeftBSAAanStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
