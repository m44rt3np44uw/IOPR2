package Huiswerk;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Opdracht_2 {

	public static void main(String [] args) {

		ArrayList<Dier> dieren = new ArrayList<Dier>();

		// Eenden
		dieren.add(new Eend("Kwik", Color.GREEN, 2, 20, true, 50));
		dieren.add(new Eend("Kwek", Color.BLUE, 2, 21, true, 49));
		dieren.add(new Eend("Kwak", Color.RED, 2, 19, true, 51));

		// Honden
		dieren.add(new Hond("Pluto", Color.ORANGE, 4, 49, true));
		dieren.add(new Hond("Brutus", Color.WHITE, 4, 51, true));

		// Katten
		dieren.add(new Kat("Marie", Color.WHITE, 4, 25, true));
		dieren.add(new Kat("Lucifer", Color.BLACK, 4, 27, true));
		dieren.add(new Kat("Figaro", Color.BLACK, 4, 23, true));
		dieren.add(new Kat("Kopa", Color.YELLOW, 4, 24, true));

		for (Dier dier : dieren) {
			System.out.println(dier);
		}

		for (Dier dier : dieren) {
			dier.praat();
		}
	}
}