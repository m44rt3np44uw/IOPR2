package Werkcollege;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Opdracht_4D extends Application {

	private BorderPane borderPane = new BorderPane();
	private Scene scene = new Scene(borderPane, 500, 100);
	private HBox box = new HBox(20);

	private Button okButtonOne   = new Button("OK 1");
	private Button okButtonTwo   = new Button("OK 2");
	private Button okButtonThree = new Button("OK 3");

	@Override
	public void start(Stage primaryStage) {

		borderPane.setCenter(okButtonOne);
		box.getChildren().addAll(okButtonTwo, okButtonThree);
		box.setAlignment(Pos.CENTER);
		borderPane.setBottom(box);

		primaryStage.setTitle("Mijn vierde scherm");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
