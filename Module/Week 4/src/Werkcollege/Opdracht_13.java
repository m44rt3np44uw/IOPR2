package Werkcollege;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Opdracht_13 extends Application {

	private CirkelPane cirkel = new CirkelPane();
	private BorderPane border = new BorderPane();
	private Scene scene = new Scene(this.border, 600, 500);
	private HBox knoppen = new HBox(10);
	private Button vergroot = new Button("Vergroot");
	private Button verklein = new Button("Verklein");

	@Override
	public void start(Stage primaryStage) throws Exception {

		this.knoppen.getChildren().addAll(this.vergroot, this.verklein);

		this.vergroot.setOnAction(e -> {
			this.cirkel.vergroten();
		});

		this.verklein.setOnAction(e -> {
			this.cirkel.verkleinen();
		});

		this.border.setCenter(this.cirkel);
		this.border.setBottom(this.knoppen);

		primaryStage.setTitle("Opdracht 13");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}