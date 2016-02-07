package Werkcollege;

import javafx.scene.paint.Color;

public class Dier {

	protected String naam;
	protected Color kleur;
	protected int poten;
	protected int lengtePoten;
	protected boolean staart;
	protected String praat;

	public Dier(String naam, Color kleur, int poten, int lengtePoten, boolean staart, String praat) {
		this.naam = naam;
		this.kleur = kleur;
		this.poten = poten;
		this.lengtePoten = lengtePoten;
		this.staart = staart;
		this.praat = praat;
	}

	public void praat() {
		System.out.println(this.praat);
	}
}