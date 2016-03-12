package Werkcollege;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scherm extends Stage{

	private Text tekst = new Text("");
	private Button sluit = new Button("Sluit scherm");
	private StackPane knoppen = new StackPane();
	private BorderPane pane = new BorderPane();
	private Scene scene = new Scene(pane);

	public Scherm() {
		this.tekst.setFont(Font.font("Verdana", FontWeight.BOLD, 70));
		this.tekst.setFill(Color.RED);
		this.knoppen.getChildren().add(this.sluit);
		this.knoppen.setAlignment(Pos.CENTER);
		this.pane.setCenter(this.tekst);
		this.pane.setBottom(this.knoppen);

		this.sluit.setOnAction(e -> {
			close();
		});

		this.setTitle("Boodschap");
		this.setScene(scene);
	}

	public void toonTekst(String tekst) {
		this.tekst.setText(tekst);
		this.sizeToScene();
		this.show();
	}
}
