package Werkcollege;

import javafx.scene.paint.Color;

public class Hond extends Dier {

	public Hond(String naam, Color kleur, int poten, int lengtePoten, boolean staart) {
		super(naam, kleur, poten, lengtePoten, staart, "Woof!");
	}

	public String toString() {
		return "De hond " + this.naam + " heeft " + this.poten + " poten, die elk " + this.lengtePoten + " cm lang zijn en heeft " + ((this.staart) ? "wel" : "niet") + " een staart.";
	}
}