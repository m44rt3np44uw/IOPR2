package Werkcollege;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Opdracht_12 extends Application {

	private Button knop = new Button("Toon in console");
	private TextField tekst = new TextField();
	private HBox pane = new HBox(10);
	private Scene scene = new Scene(pane, 300, 30);

	@Override
	public void start(Stage primaryStage) {

		this.pane.setAlignment(Pos.CENTER);
		this.pane.getChildren().addAll(this.tekst, this.knop);

		this.knop.setOnAction(e -> {
			String tekst = this.tekst.getText().trim();

			if(tekst.isEmpty()) {
				tekst = "Geen invoer...";
			}

			System.out.println(tekst);

			this.tekst.setText("");
		});

		primaryStage.setTitle("Tekst in console");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
