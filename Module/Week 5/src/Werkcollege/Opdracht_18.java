package Werkcollege;

import java.io.PrintWriter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Opdracht_18 extends Application {

	private BorderPane  borderPane = new BorderPane();
	private FlowPane    flowPane   = new FlowPane();
	private HBox        hBox       = new HBox(5);
	private Scene       scene      = new Scene(borderPane, 800, 600);

	private Label       label      = new Label("Bestandsnaam:");
	private TextField   textField  = new TextField("opdracht_18.txt");
	private TextArea    textArea   = new TextArea();
	private Button      button     = new Button("Opslaan");

	private Insets      insets     = new Insets(5, 5, 5, 5);

	private String      bestandsnaam;
	private String []   regels;

	private PrintWriter printWriter;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.layout(primaryStage);
		this.event();
	}

	private void event() {
		this.button.setOnAction(e -> {

			this.bestandsnaam = this.textField.getText().trim();
			this.regels       = this.textArea.getText().trim().split("\n");

			try {
				this.printWriter = new PrintWriter(bestandsnaam);

				for (String regel : this.regels) {
					this.printWriter.write(regel + "\n");
				}

				this.printWriter.close();
			}

			catch (Exception e1) {
				e1.printStackTrace();
			}

			this.textField.setText("");
			this.textArea.setText("");
		});
	}

	private void layout(Stage primaryStage) {
		this.hBox.setAlignment(Pos.CENTER_LEFT);
		this.hBox.getChildren().addAll(this.label, this.textField);
		this.hBox.setPadding(this.insets);

		this.flowPane.setAlignment(Pos.CENTER);
		this.flowPane.getChildren().add(this.button);
		this.flowPane.setPadding(this.insets);

		this.borderPane.setTop(this.hBox);
		this.borderPane.setCenter(this.textArea);
		this.borderPane.setBottom(this.flowPane);
		this.borderPane.setPadding(this.insets);

		primaryStage.setTitle("Tekstwegschrijver");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
