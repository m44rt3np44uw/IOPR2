package Huiswerk;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class Resultaat {

	private TextField resultaat = new TextField();


	public Resultaat() {
		this.setProperties();
	}

	public void setProperties() {
		this.getResultaat().setPrefSize(270, 50);
		this.getResultaat().setAlignment(Pos.CENTER_RIGHT);
	}


	public TextField getResultaat() {
		return resultaat;
	}
}