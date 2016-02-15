package Werkcollege;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Opdracht_6 extends Application {

	private static String [] taarten = new String[4];
	private static Scanner input = new Scanner(System.in);

	private GridPane gridPane = new GridPane();
	private Scene scene = new Scene(this.gridPane);

	@Override
	public void start(Stage primaryStage) {

		gridPane.add(new ArcPane(300, 300, 90, "Taartpunt " + 1 + ":\n" + taarten[0], Color.LIGHTGREEN), 0, 0);
		gridPane.add(new ArcPane(300, 300, 0, "Taartpunt " + 2 + ":\n" + taarten[1], Color.YELLOW), 1, 0);
		gridPane.add(new ArcPane(300, 300, 180, "Taartpunt " + 3 + ":\n" + taarten[2], Color.CYAN), 0, 1);
		gridPane.add(new ArcPane(300, 300, 270, "Taartpunt " + 4 + ":\n" + taarten[3], Color.MAGENTA), 1, 1);

		primaryStage.setTitle("Taart in kwarkstukken");
		primaryStage.setScene(this.scene);
		primaryStage.sizeToScene();
		primaryStage.show();
	}

	public static void main(String[] args) {

		System.out.println("Geef voor elk kwart stuk taart een naam: ");

		for(int i = 0; i < taarten.length; i++) {
			System.out.println("Geef de naam voor taart " + (i + 1) + ": ");
			taarten[i] = input.next();
		}

		for (String taart : taarten) {
			System.out.println(taart);
		}

		input.close();

		launch(args);
	}

}
