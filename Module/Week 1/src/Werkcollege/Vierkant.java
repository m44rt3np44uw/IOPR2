package Werkcollege;

import javafx.scene.paint.Color;

public class Vierkant {

	private double lengteZijde1;
	private Color achtergrondkleur;
	private Color omtrekkleur;

	public Vierkant() {
		this(1.0, Color.WHITE, Color.BLACK);
	}

	public Vierkant(double lengteZijde1, Color achtergrondkleur, Color omtrekkleur) {
		this.setLengteZijde1(lengteZijde1);
		this.setAchtergrondkleur(achtergrondkleur);
		this.setOmtrekkleur(omtrekkleur);
	}

	public double getLengteZijde1() {
		return lengteZijde1;
	}

	public void setLengteZijde1(double lengteZijde1) {
		this.lengteZijde1 = lengteZijde1;
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
		return this.getLengteZijde1() * 4;
	}

	public String toString() {
		return "De zijden hebben elk een lengte van " + this.getLengteZijde1() + ", die ervoor zorgen dat het vierkant een omtrek van " + this.berekenOmtrek() + " heeft.";
	}
}
