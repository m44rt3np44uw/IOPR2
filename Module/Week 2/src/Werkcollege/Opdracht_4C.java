package Werkcollege;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Opdracht_4C extends Application {

	private StackPane stackPane = new StackPane();
	private Button button = new Button("OK");
	private Scene scene = new Scene(stackPane, 600, 250);

	@Override
	public void start(Stage primaryStage) {

		stackPane.setStyle("-fx-background-color: green;");
		button.setStyle("-fx-background-color: blue; -fx-border-color: red;");

		stackPane.getChildren().add(button);

		primaryStage.setTitle("Mijn derde scherm");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
