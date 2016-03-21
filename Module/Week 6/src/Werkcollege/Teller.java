package Werkcollege;

import javafx.scene.control.TextField;

public class Teller implements Runnable {

	private       TextField input;
	private       int       getal;
	private       String    titel;
	private       boolean   draaiend = false;
	private final Object    LOCK     = new Object();

	public Teller(String titel, TextField input, int getal) {
		this.titel = titel;
		this.input = input;
		this.getal = getal;
	}

	// http://stackoverflow.com/questions/13334207/using-notify-wait-instead-of-suspend-and-resume-to-control-a-t

	@Override
	public void run() {

		while(true) {

			synchronized (this.LOCK) {

				if(!isDraaiend()) {

					try {
						this.LOCK.wait();
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
		synchronized (this.LOCK) {
			this.draaiend = true;
			this.LOCK.notifyAll();
		}
	}

	public void stop() {
		synchronized (this.LOCK) {
			this.draaiend = false;
			this.LOCK.notifyAll();
		}
	}

	public String getTitel() {
		return this.titel;
	}
}