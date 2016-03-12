package Huiswerk;

import javafx.scene.control.Button;

public class Knop {

	private Button knop = new Button();
	private String tekst;
	private int    breedte;
	private int    hoogte;

	public Knop(String tekst, int breedte, int hoogte) {
		this.tekst   = tekst;
		this.breedte = breedte;
		this.hoogte  = hoogte;

		this.setProperties();
	}

	private void setProperties() {
		this.knop.setText(this.tekst);
		this.knop.setPrefWidth(this.breedte);
		this.knop.setPrefHeight(this.hoogte);
	}

	public Button getKnop() {
		return this.knop;
	}

	public void event() {
		this.knop.setOnAction(e -> {

		});
	}
}