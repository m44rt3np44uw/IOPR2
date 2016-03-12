package Werkcollege;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Opdracht_14 extends Application {

	private BorderPane borderPane = new BorderPane();
	private FlowPane flowPane     = new FlowPane(Orientation.HORIZONTAL);
	private Scene scene           = new Scene(this.borderPane, 600, 500);
	private TextField invoer      = new TextField();
	private TextArea uitvoer      = new TextArea();
	private Button toonUitvoer    = new Button("Toon in uitvoer");
	private Button toonInvoer     = new Button("Toon in Scherm");
	private Insets insets         = new Insets(5, 5, 5, 5);
	private Scherm boodschap      = new Scherm();

	public void vulAan() {
		this.uitvoer.appendText(this.invoer.getText().trim() + "\n");
		this.invoer.setText("");
	}

	public void events() {
		this.invoer.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.ENTER) {
				vulAan();
			}
		});

		this.toonUitvoer.setOnAction(e -> {
			vulAan();
		});

		this.toonInvoer.setOnAction(e -> {
			String tekst = this.invoer.getText().trim();
			this.boodschap.toonTekst(tekst);
			this.invoer.setText("");
		});
	}

	public void maakScherm() {
		this.borderPane.setTop(this.invoer);
		this.borderPane.setCenter(this.uitvoer);
		this.borderPane.setBottom(this.flowPane);
		this.borderPane.setPadding(this.insets);

		this.uitvoer.setPadding(this.insets);

		this.flowPane.getChildren().addAll(this.toonUitvoer, this.toonInvoer);
		this.flowPane.setPadding(this.insets);
		this.flowPane.setAlignment(Pos.CENTER);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		maakScherm();
		events();

		primaryStage.setTitle("Tekst in textarea of nieuw scherm");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}