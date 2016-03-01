package Werkcollege;

import java.util.ArrayList;

public interface ExamencommissieLid {

	public void beoordeeltKlachten(Student student);
	public ArrayList<Boolean> beoordeeltCijfers(Student student);
	public void geeftAfGetuigenschrift(Student student);
}