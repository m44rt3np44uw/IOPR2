package Werkcollege;

import javafx.scene.paint.Color;

public abstract class Figuur {

	protected Color achtergrondkleur;
	protected Color omtrekkleur;
	protected double lengteZijde1;

	public abstract double berekenOmtrek();
	public abstract String toString();

	public Color getAchtergrondkleur() {
		return this.achtergrondkleur;
	}

	public void setAchtergrondkleur(Color achtergrondkleur) {
		this.achtergrondkleur = achtergrondkleur;
	}

	public Color getOmtrekkleur() {
		return this.omtrekkleur;
	}

	public void setOmtrekkleur(Color omtrekkleur) {
		this.omtrekkleur = omtrekkleur;
	}

	public double getLengteZijde1() {
		return this.lengteZijde1;
	}

	public void setLengteZijde1(double lengteZijde1) {
		this.lengteZijde1 = lengteZijde1;
	}

}