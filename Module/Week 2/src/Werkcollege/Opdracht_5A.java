package Werkcollege;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Opdracht_5A extends Application {

	// Stage 1
	private StackPane stackPane = new StackPane();
	private Circle circle = new Circle();
	private Scene scene = new Scene(this.stackPane);
	private Label label = new Label("Opgave 5: Cirkel");

	@Override
	public void start(Stage primaryStage) {

		this.circle.setRadius(100);
		this.circle.setStroke(Color.BLACK);
		this.circle.setFill(Color.WHITE);
		this.stackPane.getChildren().add(this.circle);

		this.label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 25));
		this.stackPane.getChildren().add(this.label);

		primaryStage.setTitle("Opgave 5: Cirkel");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
