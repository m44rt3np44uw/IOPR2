package Huiswerk;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

public class Rij {

	private HBox rij = new HBox(5);
	private ArrayList<Knop> knoppen = new ArrayList<Knop>();
	private Resultaat resultaat;

	public Rij(int boven, int rechts, int onder, int links) {
		this.rij.setPadding(new Insets(boven, rechts, onder, links));
	}

	public void voegToeKnop(Knop[] knoppen) {
		for (Knop knop : knoppen) {
			this.knoppen.add(knop);
		}

		for (Knop knop : this.knoppen) {
			this.rij.getChildren().add(knop.getKnop());
		}
	}

	public void voegResultaatToe(Resultaat resultaat) {
		this.resultaat = resultaat;

		this.rij.getChildren().add(this.resultaat.getResultaat());
	}

	public HBox getRij() {
		return this.rij;
	}
}