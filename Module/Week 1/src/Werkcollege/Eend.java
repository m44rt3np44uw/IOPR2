package Werkcollege;

import javafx.scene.paint.Color;

public class Eend extends Dier {

	private int snavel;

	public Eend(String naam, Color kleur, int poten, int lengtePoten, boolean staart, int snavel) {
		super(naam, kleur, poten, lengtePoten, staart, "Kwak!");
		this.snavel = snavel;
	}

	public String toString() {
		return "De eend " + this.naam + " heeft " + this.poten + " poten, die elk " + this.lengtePoten + " cm lang zijn, heeft een snavel met de lengte van " + this.snavel + " en heeft " + ((this.staart) ? "wel" : "niet") + " een staart.";
	}
}