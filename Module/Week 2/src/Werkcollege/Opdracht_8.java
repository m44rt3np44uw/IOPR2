package Werkcollege;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Opdracht_8 extends Application {

	private Button ok = new Button();
	private Button cancel = new Button();

	private FlowPane flowPane = new FlowPane();
	private Scene scene = new Scene(this.flowPane, 200, 250);

	@Override
	public void start(Stage primaryStage) {

		this.ok.setText("OK");
		this.ok.setOnAction(e -> {
			System.out.println("De OK-knop is geklikt.");
		});

		this.cancel.setText("Cancel");
		this.cancel.setOnAction(e -> {
			System.out.println("De Cancel-knop in geklikt.");
		});

		this.flowPane.setAlignment(Pos.CENTER);
		this.flowPane.setOrientation(Orientation.VERTICAL);
		this.flowPane.getChildren().addAll(this.ok, this.cancel);


		primaryStage.setTitle("Scherm met event handling");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}