package Werkcollege;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Opdracht_7 extends Application {

	private Pane pane = new Pane();
	private Scene scene = new Scene(this.pane, 400, 250);

	private Polyline polyline = new Polyline();

	private Line lineX = new Line();
	private Line lineY = new Line();

	private Text textX = new Text();
	private Text textY = new Text();

	private final int steps = 200;

	@Override
	public void start(Stage primaryStage) throws Exception {

		for(int x = this.steps / -2; x <= this.steps / 2; x++) {
			this.polyline.getPoints().add(x + (double)this.steps);
			this.polyline.getPoints().add((double)this.steps - power(x));
		}

		this.lineX.setStartX(10);
		this.lineX.setStartY(200);
		this.lineX.setEndX(390);
		this.lineX.setEndY(200);

		this.lineY.setStartX(200);
		this.lineY.setStartY(30);
		this.lineY.setEndX(200);
		this.lineY.setEndY(390);

		this.textX.setText("X");
		this.textX.setX(380);
		this.textX.setY(190);

		this.textY.setText("Y");
		this.textY.setX(210);
		this.textY.setY(40);

		this.pane.getChildren().addAll(this.polyline, this.lineX, this.lineY, this.textX, this.textY);

		primaryStage.setTitle("Opgave 7: y = x^2");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static double power(double x) {
		return 0.0125 * Math.pow(x, 2);
	}
}