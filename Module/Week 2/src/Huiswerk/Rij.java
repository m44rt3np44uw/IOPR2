package Huiswerk;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

public class Rij {

	private HBox rij = new HBox(5);
	private ArrayList<Knop> knoppen = new ArrayList<Knop>();

	public Rij(int boven, int rechts, int onder, int links) {
		this.getRij().setPadding(new Insets(boven, rechts, onder, links));
	}

	public void voegToeKnop(Knop[] knoppen) {
		for (Knop knop : knoppen) {
			this.knoppen.add(knop);
		}
	}

	public HBox getRij() {
		for (Knop knop : this.knoppen) {
			this.rij.getChildren().add(knop.getKnop());
		}

		return this.rij;
	}

	public void setRij(HBox rij) {
		this.rij = rij;
	}

}