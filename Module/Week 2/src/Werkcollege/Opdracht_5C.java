package Werkcollege;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Opdracht_5C extends Application {

	private int x = 20;
	private int y = 20;
	private int width = 300;
	private int height = 200;

	// Stage 1
	private StackPane stackPane = new StackPane();
	private Scene scene = new Scene(this.stackPane);
	private Circle circle = new Circle();
	private Label label = new Label();

	// Stage 2
	private Stage secondStage = new Stage();
	private Pane pane = new Pane();
	private Scene secondScene = new Scene(this.pane, (this.width * 1.5) + (this.x * 2), (this.height * 3) + (this.y * 4));

	private Rectangle firstRectangle = new Rectangle();
	private Rectangle secondRectangle = new Rectangle();
	private Rectangle thirdRectangle = new Rectangle();

	private Ellipse firstEllipse = new Ellipse();
	private Ellipse secondEllipse = new Ellipse();
	private Ellipse thirdEllipse = new Ellipse();

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Stage 1
		this.circle.setRadius(100);
		this.circle.setStroke(Color.BLACK);
		this.circle.setFill(Color.WHITE);

		this.label.setText("Opgave 5: Cirkel");
		this.label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 25));

		this.stackPane.getChildren().addAll(this.circle, this.label);

		primaryStage.setTitle("Opgave 5: Cirkel");
		primaryStage.setScene(this.scene);
		primaryStage.show();

		// Stage 2
		this.secondStage.setTitle("Opgave 5: Vierhoeken");
		this.secondStage.setScene(this.secondScene);
		this.secondStage.show();

		this.firstRectangle.setWidth(this.width);
		this.firstRectangle.setHeight(this.height);
		this.firstRectangle.setFill(Color.RED);
		this.firstRectangle.setStroke(Color.BLUE);
		this.firstRectangle.setX(this.x);
		this.firstRectangle.setY(this.y);

		this.secondRectangle.setWidth(this.width);
		this.secondRectangle.setHeight(this.height);
		this.secondRectangle.setFill(Color.GREEN);
		this.secondRectangle.setStroke(Color.RED);
		this.secondRectangle.setX(this.x);
		this.secondRectangle.setY((this.y * 2) + (this.height));

		this.thirdRectangle.setWidth(this.width);
		this.thirdRectangle.setHeight(this.height);
		this.thirdRectangle.setFill(Color.BLUE);
		this.thirdRectangle.setStroke(Color.GREEN);
		this.thirdRectangle.setX(this.x);
		this.thirdRectangle.setY((this.y * 3) + (this.height * 2));

		this.firstEllipse.setRadiusX(this.width / 2);
		this.firstEllipse.setRadiusY(this.height / 2);
		this.firstEllipse.setFill(Color.RED);
		this.firstEllipse.setStroke(Color.BLUE);
		this.firstEllipse.setCenterX(this.x + this.width);
		this.firstEllipse.setCenterY(this.y + this.height / 2);

		this.secondEllipse.setRadiusX(this.width / 2);
		this.secondEllipse.setRadiusY(this.height / 2);
		this.secondEllipse.setFill(Color.GRAY);
		this.secondEllipse.setStroke(Color.GREEN);
		this.secondEllipse.setCenterX(this.x + this.width);
		this.secondEllipse.setCenterY(this.y * 2 + this.height * 1.5);

		this.thirdEllipse.setRadiusX(this.width / 2);
		this.thirdEllipse.setRadiusY(this.height / 2);
		this.thirdEllipse.setFill(Color.LIME);
		this.thirdEllipse.setStroke(Color.RED);
		this.thirdEllipse.setCenterX(this.x + this.width);
		this.thirdEllipse.setCenterY(this.y * 3 + this.height * 2.5);

		this.pane.getChildren().addAll(
			this.firstRectangle,
			this.secondRectangle,
			this.thirdRectangle,
			this.firstEllipse,
			this.secondEllipse,
			this.thirdEllipse
		);
	}

	public static void main(String[] args) {
		launch(args);
	}
}