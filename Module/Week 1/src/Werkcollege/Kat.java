package Werkcollege;

import javafx.scene.paint.Color;

public class Kat extends Dier {

	public Kat(String naam, Color kleur, int poten, int lengtePoten, boolean staart) {
		super(naam, kleur, poten, lengtePoten, staart, "Miauw!");
	}
	public String toString() {
		return "De kat " + this.naam + " heeft " + this.poten + " poten, die elk " + this.lengtePoten + " cm lang zijn en heeft " + ((this.staart) ? "wel" : "niet") + " een staart.";
	}
}