package Werkcollege;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TellerPane extends GridPane {

	private String    titel;
	private int       startGetal;
	private Teller    teller;
	private Thread    thread;

	private Label     label  = new Label();
	private TextField input  = new TextField();
	private Button    start  = new Button("Start");
	private Button    stop   = new Button("Stop");

	public TellerPane(String titel, int startGetal) {

		super();

		this.titel      = titel;
		this.startGetal = startGetal;

		this.label.setText(this.titel);
		this.input.setText(Integer.toString(this.startGetal));

		this.maakLayout();
		this.definieerTeller();
	}

	private void event() {
		this.start.setOnAction(e -> {
			System.out.println(this.teller.getTitel() + " wordt gestart.");
			this.teller.start();
		});

		this.stop.setOnAction(e -> {
			System.out.println(this.teller.getTitel() + " wordt gestopt.");
			this.teller.stop();
		});
	}

	private void definieerTeller() {
		this.teller = new Teller(this.titel, this.input, this.startGetal);
		this.thread = new Thread(this.teller);

		this.event();

		this.thread.start();
	}

	private void maakLayout() {
		this.add(label, 0, 0);
		this.add(input, 0, 1);
		this.add(start, 0, 2);
		this.add(stop,  0, 3);

		this.setHgap(5);
		this.setVgap(5);
	}
}