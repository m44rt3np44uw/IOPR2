package Werkcollege;

import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Opdracht_21 extends Application {

	private static GridPane      pane       = new GridPane();
	private static Scene         scene      = new Scene(pane);
	private static TellerPane [] tellerPane = new TellerPane[3];
	private static Scanner       scanner    = new Scanner(System.in);
	private static int           startGetal;

	@Override
	public void start(Stage primaryStage) throws Exception {
		panes();
		layout(primaryStage);
	}

	private void panes() {
		for (int i = 0; i < tellerPane.length; i++) {
			System.out.print("Vul het startgetal van teller " + (i + 1) + " in: ");
			startGetal = scanner.nextInt();
			tellerPane[i] = new TellerPane("Teller " + (i + 1), startGetal);
			pane.add(tellerPane[i], i, 0);
		}

		scanner.close();
	}

	public static void layout(Stage primaryStage) {

		pane.setPadding(new Insets(5));
		pane.setHgap(5);
		pane.setVgap(5);

		primaryStage.setTitle("Schermtellers");
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}