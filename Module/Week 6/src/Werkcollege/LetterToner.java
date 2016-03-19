package Werkcollege;

public class LetterToner implements Runnable {

	private char letter;
	private int  getal;

	public LetterToner(char letter, int getal) {
		this.letter = letter;
		this.getal  = getal;
	}

	@Override
	public void run() {

		for(int i = 0; i < this.getal; i++) {

			if(i % 10 == 0) {
				Thread.yield();
			}

			if (i % 50 == 0) {

				try {
					Thread.sleep(3000);
				}

				catch (InterruptedException e) {}
			}

			else {
				System.out.println((i + 1) + ": " + Character.toUpperCase(this.letter));
			}
		}
	}
}
