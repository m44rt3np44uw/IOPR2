package Werkcollege;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirkelPane extends StackPane {

	private Circle circle = new Circle(100);

	public CirkelPane() {
		getChildren().add(circle);
		this.circle.setStroke(Color.BLACK);
		this.circle.setFill(Color.WHITE);
	}

	public void vergroten() {
		this.circle.setRadius(this.circle.getRadius() + 1);
	}

	public void verkleinen() {
		this.circle.setRadius(this.circle.getRadius() - 1);
	}
}