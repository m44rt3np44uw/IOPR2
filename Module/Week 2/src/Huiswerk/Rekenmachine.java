package Huiswerk;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Rekenmachine extends Application {

	private static String [][] buttons = new String [][] {
		{
			"MC",
			"MR",
			"MS",
			"M+",
			"M-",
		},
		{
			"←",
			"CE",
			"C",
			"±",
			"√",
		},
		{
			"7",
			"8",
			"9",
			"/",
			"%",
		},
		{
			"4",
			"5",
			"6",
			"*",
			"1/x",
		},
		{
			"1",
			"2",
			"3",
			"-",
			"=",
		},
		{
			"0",
			".",
			"+",
		}
	};

	private VBox vBox = new VBox();
	private Scene scene = new Scene(this.vBox, 280, 390);

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.addLayout();
		this.setStage(primaryStage);
	}

	private void setStage(Stage primaryStage) {
		primaryStage.setTitle("Rekenmachine");
		primaryStage.setResizable(false);
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	private void addLayout() {

		HBox hBox = new HBox(5);
		hBox.setPadding(new Insets(5, 5, 0, 5));

		TextField result = new TextField();
		result.setPrefSize(270, 50);
		result.setAlignment(Pos.CENTER_RIGHT);

		hBox.getChildren().add(result);

		this.vBox.getChildren().add(hBox);

		int i = 0;
		for (String[] row : buttons) { i++;

			hBox = new HBox(5);

			if(buttons.length == i) {
				hBox.setPadding(new Insets(-50, 5, 0, 5));
			} else {
				hBox.setPadding(new Insets(5, 5, 0, 5));
			}

			for (String button : row) {

				Button btn = new Button(button);

				if(button == "=") {
					btn.setPrefSize(50, 105);
				} else if(button == "0") {
					btn.setPrefSize(105, 50);
				} else {
					btn.setPrefSize(50, 50);
				}

				hBox.getChildren().add(btn);
			}

			this.vBox.getChildren().add(hBox);
		}
	}

	public static void main(String[] args) {
		launch();
	}
}