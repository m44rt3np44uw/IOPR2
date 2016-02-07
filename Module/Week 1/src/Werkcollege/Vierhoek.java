package Werkcollege;

import javafx.scene.paint.Color;

public class Vierhoek {

	private double lengteZijde1;
	private double lengteZijde2;
	private Color achtergrondkleur;
	private Color omtrekkleur;

	public Vierhoek() {
		this(1.0, 1.0, Color.WHITE, Color.BLACK);
	}

	public Vierhoek(double lengteZijde1, double lengteZijde2, Color achtergrondkleur, Color omtrekkleur) {
		this.setLengteZijde1(lengteZijde1);
		this.setLengteZijde2(lengteZijde2);
		this.setAchtergrondkleur(achtergrondkleur);
		this.setOmtrekkleur(omtrekkleur);
	}

	public double getLengteZijde1() {
		return lengteZijde1;
	}

	public void setLengteZijde1(double lengteZijde1) {
		this.lengteZijde1 = lengteZijde1;
	}

	public double getLengteZijde2() {
		return lengteZijde2;
	}

	public void setLengteZijde2(double lengteZijde2) {
		this.lengteZijde2 = lengteZijde2;
	}

	public Color getAchtergrondkleur() {
		return achtergrondkleur;
	}

	public void setAchtergrondkleur(Color achtergrondkleur) {
		this.achtergrondkleur = achtergrondkleur;
	}

	public Color getOmtrekkleur() {
		return omtrekkleur;
	}

	public void setOmtrekkleur(Color omtrekkleur) {
		this.omtrekkleur = omtrekkleur;
	}

	public double berekenOmtrek() {
		return (this.getLengteZijde1() * 2) + (this.getLengteZijde2() * 2);
	}

	public String toString() {
		return "De zijden hebben elk een lengte van " + this.getLengteZijde1() + " en " + this.getLengteZijde2() + ", die ervoor zorgen dat de vierhoek een omtrek van " + this.berekenOmtrek() + " heeft.";
	}
}