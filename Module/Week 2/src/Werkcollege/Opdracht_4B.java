package Werkcollege;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Opdracht_4B extends Application {

	private BorderPane borderPane = new BorderPane();
	private FlowPane flowPane = new FlowPane();
	private Scene scene = new Scene(borderPane, 500, 100);

	private Button okButtonOne   = new Button("OK 1");
	private Button okButtonTwo   = new Button("OK 2");
	private Button okButtonThree = new Button("OK 3");

	@Override
	public void start(Stage primaryStage) {

		borderPane.setCenter(okButtonOne);
		flowPane.getChildren().addAll(okButtonTwo, okButtonThree);
		borderPane.setBottom(flowPane);

		primaryStage.setTitle("Mijn tweede scherm");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}