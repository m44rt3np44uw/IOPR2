package Werkcollege;

import java.io.Serializable;

public class Dier implements Serializable {

	protected String naam;
	protected int poten;
	protected int lengtePoten;
	protected boolean staart;
	protected String praat;

	public Dier(String naam, int poten, int lengtePoten, boolean staart, String praat) {
		this.naam = naam;
		this.poten = poten;
		this.lengtePoten = lengtePoten;
		this.staart = staart;
		this.praat = praat;
	}

	public void praat() {
		System.out.println(this.praat);
	}
}
