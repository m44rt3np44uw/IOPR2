package Werkcollege;

public class Opdracht_9C {

	public static void main(String [] args) {

		try {
			int antwoord = 2 / 0;
		}

		catch(ArithmeticException exception) {
			System.out.println(exception.toString());
		}
	}
}