package Huiswerk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Opdracht_6 extends Application {

	private BorderPane borderPane = new BorderPane();
	private Scene      scene      = new Scene(borderPane, 800, 600);

	private FlowPane   top        = new FlowPane(5, 5);
	private Label      label      = new Label("Bestandsnaam:");
	private TextField  textField  = new TextField();
	private Button     open       = new Button("Open tekstbestand");

	private TextArea   textArea   = new TextArea();

	private FlowPane   bottom     = new FlowPane(5, 5);
	private Button     toon       = new Button("Toon in Uitvoer");
	private Button     verwijder  = new Button("Verwijder tekst");

	private Insets     insets     = new Insets(5, 5, 5, 5);

	private Bestand    kiezer     = new Bestand();
	private File       bestand;
	private Scanner    scanner;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.layout(primaryStage);
		this.open();
		this.toon();
		this.verwijder();
		this.enter();
	}

	private void enter() {
		this.textField.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.ENTER) {
				this.leeg();
				this.inhoud();
			}
		});
	}

	private void leeg() {
		this.textArea.setText("");
	}

	private void verwijder() {
		this.verwijder.setOnAction(e -> {
			this.textField.setText("");
			this.textArea.setText("");
		});
	}

	private void toon() {
		this.toon.setOnAction(e -> {
			this.leeg();
			this.inhoud();
		});
	}

	private void open() {
		this.open.setOnAction(e -> {
			this.textField.setText(this.kiezer.openTekstBestand());
		});
	}

	private void inhoud() {
		this.bestand = new File(this.textField.getText().trim());

		try {
			this.scanner = new Scanner(this.bestand);

			while(this.scanner.hasNext()) {
				this.textArea.appendText(this.scanner.nextLine() + "\n");
			}

			this.scanner.close();
		}

		catch (FileNotFoundException e) {}
	}


	private void layout(Stage primaryStage) {

		this.top.setAlignment(Pos.CENTER_LEFT);
		this.top.getChildren().addAll(this.label, this.textField, this.open);
		this.top.setPadding(this.insets);

		this.bottom.setAlignment(Pos.CENTER);
		this.bottom.getChildren().addAll(this.toon, this.verwijder);
		this.bottom.setPadding(this.insets);

		this.borderPane.setPadding(this.insets);
		this.borderPane.setTop(this.top);
		this.borderPane.setCenter(this.textArea);
		this.borderPane.setBottom(this.bottom);

		primaryStage.setTitle("Inleesprogramma");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}