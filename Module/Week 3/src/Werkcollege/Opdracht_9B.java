package Werkcollege;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Opdracht_9B {

	public static void main(String [] args) {

		// Opdracht 9B.1
		try {
			String [] arrDocenten = new String[3];
			arrDocenten[1] = "Koen";
			arrDocenten[2] = "Rob";
			arrDocenten[3] = "Martijn";
		}

		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception.toString() + exception.getMessage());
		}

		// Opdracht 9B.2
		try {
			String onderwijsmanager = "Patrick Pijnenburg";
			onderwijsmanager = null;
			int indexPositie = onderwijsmanager.indexOf(" ");
		}

		catch(NullPointerException exception) {
			System.out.println(exception.toString() + ": " + exception.getMessage());
		}

		// Opdracht 9B.3
		try {
			String leeftijdMartijn = "34 jaar";
			int leeftijdVanMartijn = Integer.parseInt(leeftijdMartijn);
		}

		catch(NumberFormatException exception) {
			System.out.println(exception.toString());
		}

		// Opdracht 9B.4
		try {
			DataInputStream invoer = new DataInputStream(new FileInputStream("bestand.dat"));
			while (true) {
				System.out.println(invoer.readDouble());
			}
		}

		catch(FileNotFoundException exception) {
			System.out.println(exception.toString());
		}

		catch(IOException exception) {
			System.out.println(exception.toString());
		}
	}
}
