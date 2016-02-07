package Werkcollege;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Opdracht_1E {

	public static void main(String [] args) {
		ArrayList<Figuur> figuren = new ArrayList<Figuur>();
		figuren.add(new Driehoek(2.0, 2.0, 2.0, Color.AZURE, Color.AQUAMARINE));
		figuren.add(new Vierkant(2.0, Color.AZURE, Color.AQUAMARINE));
		figuren.add(new Vierhoek(2.0, 2.0, Color.AZURE, Color.AQUAMARINE));

		for (Figuur figuur : figuren) {
			System.out.println(figuur.toString());
		}
	}
}