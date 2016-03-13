package Werkcollege;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Opdracht_15 {

	private static File bestand;
	private static Scanner scanner = new Scanner(System.in);
	private static String bestandsnaam;

	public static void main(String[] args) {

		System.out.println("Vul een bestandsnaam in:");
		bestandsnaam = scanner.nextLine();

		bestand = new File(bestandsnaam);

		if(bestand.exists()) {
			System.out.println("Het tekstbestand " + bestandsnaam + " bestaat al! Het is daarom niet opnieuw aangemaakt.");
		}

		else {
			try {
				bestand.createNewFile();
				System.out.println("Het tekstbestand " + bestandsnaam + " is zojuist aangemaakt.");
			}

			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}