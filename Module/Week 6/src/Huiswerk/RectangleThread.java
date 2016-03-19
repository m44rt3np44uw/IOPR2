package Huiswerk;

import javafx.scene.shape.Rectangle;

public class RectangleThread extends Thread {

	private Rectangle rectangle;

	public RectangleThread(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	@Override
	public void run() {

		while(this.rectangle.getHeight() < 460) {

			try {
				Thread.sleep(500);
			}

			catch (InterruptedException e) {}
			catch (ArrayIndexOutOfBoundsException e) {}

			double height = this.rectangle.getHeight() + 10;
			this.rectangle.setHeight(height);
		}
	}
}