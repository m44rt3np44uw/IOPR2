package Werkcollege;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ArcPane extends Pane {

	private StackPane stackPane = new StackPane();
	private Arc arc;
	private Text text;

	private final double length = 90;

	public ArcPane(double x, double y, double start, String text, Color color) {

		this.arc = new Arc(x, y, x, y, start, this.length);
		this.arc.setType(ArcType.ROUND);
		this.arc.setFill(color);
		this.arc.setStroke(Color.BLACK);

		this.text = new Text(x, y, text);
		this.text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25));
		this.text.setFill(Color.BLUE);

		this.stackPane.getChildren().addAll(this.arc, this.text);
		this.stackPane.autosize();
		getChildren().add(this.stackPane);
	}
}