package Huiswerk;

import javafx.scene.layout.Pane;

public class BalPane extends Pane {

	private Bal    bal;
	private Thread thread;

	public BalPane() {
		this.klikOpHetScherm();
	}

	private void klikOpHetScherm() {

		this.setOnMouseClicked(e -> {

			this.bal    = new Bal(e.getX(), e.getY());
			this.thread = new Thread(this.bal);

			this.thread.start();

			this.getChildren().add(this.bal);
		});
	}
}
