package Werkcollege;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Opdracht_3 {

	public static void main(String [] args) {

		ArrayList<Dier> dieren = new ArrayList<Dier>();
		dieren.add(new Eend("Kwik", Color.GREEN, 2, 20, true, 50));
		dieren.add(new Hond("Pluto", Color.ORANGE, 4, 49, true));
		dieren.add(new Kat("Marie", Color.WHITE, 4, 25, true));

		for (Dier dier : dieren) {
			System.out.println(dier.toString());
		}
	}
}