package Werkcollege;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Opdracht_4A extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Button knop = new Button("knop");
		Scene scene = new Scene(knop, 600, 250);

		primaryStage.setTitle("Mijn eerste scherm");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}