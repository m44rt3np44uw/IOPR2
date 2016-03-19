package Huiswerk;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bal extends Circle implements Runnable {

	private final double MIN    =   0.0;
	private final double MAX    = 500.0;
	private final double RADIUS =  10.0;

	private double verandering = 10.0;

	public Bal(double x, double y) {
		this.setCenterX(this.bereken(x));
		this.setCenterY(this.bereken(y));
		this.setRadius(this.RADIUS);
		this.setFill(Color.GRAY);
		this.setStroke(Color.BLACK);
	}

	private double bereken(double positie) {
		return (Math.round(positie / 10)) * 10;
	}

	@Override
	public void run() {

		while(true) {

			try {
				Thread.sleep(1000);
			}

			catch (InterruptedException e) {}

			this.setCenterX(this.getCenterX() + verandering);

			if (this.getCenterX() >= (this.MAX - this.RADIUS)) {
				this.verandering = -10.0;
			}

			else if (this.getCenterX() < (this.MIN + (this.RADIUS * 1.5))) {
				this.verandering = 10.0;
			}
		}
	}
}