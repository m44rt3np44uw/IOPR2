package Werkcollege;

import javafx.scene.control.TextField;

public class Teller implements Runnable {

	private TextField input;
	private int       getal;
	private boolean   draaiend = false;
	private String    titel;

	public Teller(String titel, TextField input, int getal) {
		this.titel = titel;
		this.input = input;
		this.getal = getal;
	}

	// http://stackoverflow.com/questions/13334207/using-notify-wait-instead-of-suspend-and-resume-to-control-a-t

	@Override
	public void run() {

		while(true) {

			synchronized (this) {

				if(!isDraaiend()) {

					try {
						this.wait();
					}

					catch(InterruptedException e) {}
				}

				else {
					this.getal++;
					this.input.setText(String.valueOf(this.getal));
				}
			}

			try {
				Thread.sleep(1000);
			}

			catch (InterruptedException e) {}
		}
	}

	private boolean isDraaiend() {
		return this.draaiend;
	}

	public void start() {
		synchronized (this) {
			this.draaiend = true;
			this.notifyAll();
		}
	}

	public void stop() {
		synchronized (this) {
			this.draaiend = false;
			this.notifyAll();
		}
	}

	public String getTitel() {
		return this.titel;
	}
}