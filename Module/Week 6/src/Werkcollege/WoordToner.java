package Werkcollege;

public class WoordToner extends Thread {

	private String woord;
	private int    getal;

	public WoordToner(String woord, int getal) {
		super();

		this.woord = woord;
		this.getal = getal;
	}

	public void run() {
		for (int i = 0; i < this.getal; i++) {
			System.out.println((i + 1) + ": " + this.woord);
		}
	}
}
