package Werkcollege;

import javafx.scene.paint.Color;

public class Zoogdier extends Dier {

	private String dier;

	public Zoogdier(String naam, Color kleur, int poten, int lengtePoten, boolean staart, String praat, String dier) {
		super(naam, kleur, poten, lengtePoten, staart, praat);
		this.dier = dier;
	}

	public void praat() {
		System.out.println("De " + this.dier + " " + this.naam + " heeft " + this.poten + " poten, die elk " + this.lengtePoten + " cm lang zijn en heeft " + ((this.staart) ? "wel" : "niet") + " een staart.");
	}
}