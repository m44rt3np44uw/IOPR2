package Werkcollege;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Opdracht_4A extends Application {

	private Button button = new Button("OK!");
	private Scene scene = new Scene(button, 600, 250);

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Mijn eerste scherm");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}