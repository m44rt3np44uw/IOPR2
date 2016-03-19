package Werkcollege;

public class Opdracht_19 {

	public static void main(String[] args) {
		LetterToner la = new LetterToner('A', 100);
		LetterToner lb = new LetterToner('B', 100);
		LetterToner lc = new LetterToner('C', 100);

		Thread ta = new Thread(la);
		Thread tb = new Thread(lb);
		Thread tc = new Thread(lc);

		ta.start();
		tb.start();
		tc.start();
	}
}
