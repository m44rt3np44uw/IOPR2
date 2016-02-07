package Huiswerk;

import javafx.scene.paint.Color;

public class Vogel extends Dier {

	protected int snavel;
	private String dier;

	public Vogel(String naam, Color kleur, int poten, int lengtePoten, boolean staart, String praat, int snavel, String dier) {
		super(naam, kleur, poten, lengtePoten, staart, praat);
		this.snavel = snavel;
		this.dier = dier;
	}

	public String toString() {
		return "De " + this.dier + " " + this.naam + " heeft " + this.poten + " poten, die elk " + this.lengtePoten + " cm lang zijn, heeft een snavel met de lengte van " + this.snavel + " en heeft " + ((this.staart) ? "wel" : "niet") + " een staart.";
	}
}