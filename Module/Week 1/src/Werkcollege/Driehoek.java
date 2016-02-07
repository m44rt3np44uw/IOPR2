package Werkcollege;

import javafx.scene.paint.Color;

public class Driehoek extends Figuur {

	private double lengteZijde2;
	private double lengteZijde3;

	public Driehoek() {
		this(1.0, 1.0, 1.0, Color.WHITE, Color.BLACK);
	}

	public Driehoek(double lengteZijde1, double lengteZijde2, double lengteZijde3, Color achtergrondkleur, Color omtrekkleur) {

		this.setLengteZijde1(lengteZijde1);
		this.setLengteZijde2(lengteZijde2);
		this.setLengteZijde3(lengteZijde3);
		this.setAchtergrondkleur(achtergrondkleur);
		this.setOmtrekkleur(omtrekkleur);
	}

	public double getLengteZijde2() {
		return lengteZijde2;
	}

	public void setLengteZijde2(double lengteZijde2) {
		this.lengteZijde2 = lengteZijde2;
	}

	public double getLengteZijde3() {
		return lengteZijde3;
	}

	public void setLengteZijde3(double lengteZijde3) {
		this.lengteZijde3 = lengteZijde3;
	}

	public double berekenOmtrek() {
		return this.lengteZijde1 + this.lengteZijde2 + this.lengteZijde3;
	}

	public String toString() {
		return "De zijden hebben lengtes " + this.lengteZijde1 + ", " + this.lengteZijde2 + "en " + this.lengteZijde3 + ", die ervoor zorgen dat de driehoek en omtrek van " + this.berekenOmtrek() + " heeft.";
	}

}
