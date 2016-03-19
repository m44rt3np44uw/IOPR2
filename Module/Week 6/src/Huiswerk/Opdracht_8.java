package Huiswerk;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Opdracht_8 extends Application {

	private BalPane balPane = new BalPane();
	private Scene    scene  = new Scene(balPane, 500, 500);

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ballbauncer");
		primaryStage.setScene(this.scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
