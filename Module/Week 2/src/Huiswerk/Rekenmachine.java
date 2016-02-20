package Huiswerk;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Rekenmachine extends Application {

	private static Rij [] rijen = new Rij [] {
		new Rij(5, 5, 0, 5),
		new Rij(5, 5, 0, 5),
		new Rij(5, 5, 0, 5),
		new Rij(5, 5, 0, 5),
		new Rij(5, 5, 0, 5),
		new Rij(-50, 5, 0, 5)
	};

	private static Knop [][] knoppen = new Knop [][] {
		{
			new Knop("MC", 50, 50),
			new Knop("MR", 50, 50),
			new Knop("MC", 50, 50),
			new Knop("M+", 50, 50),
			new Knop("m-", 50, 50)
		},
		{
			new Knop("←", 50, 50),
			new Knop("CE", 50, 50),
			new Knop("C", 50, 50),
			new Knop("±", 50, 50),
			new Knop("√", 50, 50)
		},
		{
			new Knop("7", 50, 50),
			new Knop("8", 50, 50),
			new Knop("9", 50, 50),
			new Knop("/", 50, 50),
			new Knop("%", 50, 50)
		},
		{
			new Knop("4", 50, 50),
			new Knop("5", 50, 50),
			new Knop("6", 50, 50),
			new Knop("*", 50, 50),
			new Knop("1/x", 50, 50)
		},
		{
			new Knop("1", 50, 50),
			new Knop("2", 50, 50),
			new Knop("3", 50, 50),
			new Knop("-", 50, 50),
			new Knop("=", 50, 105)
		},
		{
			new Knop("0", 105, 50),
			new Knop(".", 50, 50),
			new Knop("+", 50, 50)
		}
	};

	private VBox vBox        = new VBox();
	private HBox hBox		 = new HBox(5);
	private Scene scene      = new Scene(this.vBox, 280, 390);
	private Resultaat result = new Resultaat();

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.addResult();
		this.addLayout();
		this.setStage(primaryStage);
	}

	private void addResult() {
		this.hBox.setPadding(new Insets(5, 5, 0, 5));
		this.hBox.getChildren().add(this.result.getResultaat());
		this.vBox.getChildren().add(hBox);
	}

	private void setStage(Stage primaryStage) {
		primaryStage.setTitle("Rekenmachine");
		primaryStage.setResizable(false);
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	private void addLayout() {
		for(int y = 0; y < Rekenmachine.rijen.length; y++) {
			Rij    rij  = rijen[y];
			Knop[] knop = knoppen[y];
			rij.voegToeKnop(knop);
			this.vBox.getChildren().add(rij.getRij());
		}
	}

	public static void main(String[] args) {
		launch();
	}
}