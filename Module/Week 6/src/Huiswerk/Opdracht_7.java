package Huiswerk;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Opdracht_7 extends Application {

	private BorderPane borderPane = new BorderPane();
	private FlowPane   buttonPane = new FlowPane(5, 5);
	private Pane       balkenPane = new Pane();
	private Scene      scene      = new Scene(borderPane, 500, 500);

	private Rectangle  rec1       = new Rectangle(50,  0, 100, 200);
	private Rectangle  rec2       = new Rectangle(200, 0, 100, 200);
	private Rectangle  rec3       = new Rectangle(350, 0, 100, 200);

	private Button     knop1      = new Button("Rectangle 1");
	private Button     knop2      = new Button("Rectangle 2");
	private Button     knop3      = new Button("Rectangle 3");

	private RectangleThread rectangleThread1;
	private RectangleThread rectangleThread2;
	private RectangleThread rectangleThread3;

	@Override
	public void start(Stage primaryStage) throws Exception {
		balken();
		threads();
		events();
		layout(primaryStage);
	}

	private void balken() {
		this.rec1.setFill(Color.RED);
		this.rec1.setStroke(Color.BLACK);

		this.rec2.setFill(Color.GREEN);
		this.rec2.setStroke(Color.BLACK);

		this.rec3.setFill(Color.BLUE);
		this.rec3.setStroke(Color.BLACK);
	}

	private void threads() {
		this.rectangleThread1 = new RectangleThread(this.rec1);
		this.rectangleThread2 = new RectangleThread(this.rec2);
		this.rectangleThread3 = new RectangleThread(this.rec3);
	}

	private void events() {
		knop1.setOnAction(e -> {
			this.rectangleThread1.start();
		});

		knop2.setOnAction(e -> {
			this.rectangleThread2.start();
		});

		knop3.setOnAction(e -> {
			this.rectangleThread3.start();
		});
	}

	private void layout(Stage primaryStage) {

		this.balkenPane.getChildren().addAll(this.rec1, this.rec2, this.rec3);

		this.buttonPane.getChildren().addAll(this.knop1, this.knop2, this.knop3);
		this.buttonPane.setAlignment(Pos.CENTER);

		this.borderPane.setCenter(this.balkenPane);
		this.borderPane.setBottom(this.buttonPane);
		this.borderPane.setPadding(new Insets(0, 5, 5, 5));

		primaryStage.setTitle("Balkenladders");
		primaryStage.setScene(this.scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
