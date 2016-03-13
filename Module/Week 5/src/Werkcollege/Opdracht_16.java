package Werkcollege;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht_16 {

	private static Scanner scanner          = new Scanner(System.in);
	private static ArrayList<String> regels = new ArrayList<String>();

	private static PrintWriter printWriter;
	private static DataOutputStream dataOutputStream;
	private static FileOutputStream fileOutputStream;

	private static String binaire;
	private static String tekst;
	private static String invoer;


	public static void main(String[] args) {
		bestanden();
		regels();
		tekst();
		binaire();
	}

	public static void bestanden() {
		System.out.println("Vul de basisnaam in:");

		invoer = scanner.nextLine();

		binaire = invoer + ".dat";
		tekst   = invoer + ".txt";

		System.out.println("De bestanden worden " + binaire + " en " + tekst + ".");
	}

	public static void regels() {

		do {
			System.out.print("Regel " + (regels.size() + 1) + ": ");
			invoer = scanner.nextLine();
			regels.add(invoer);
		}

		while(!invoer.equals("STOP"));

		regels.remove("STOP");
	}

	public static void tekst() {
		try {
			printWriter = new PrintWriter(tekst);

			for (String regel : regels) {
				if(regels.get(regels.size() - 1).equals(regel)) {
					printWriter.append(regel);
				} else {
					printWriter.append(regel + "\n");
				}
			}

			System.out.println("De regels zijn weggeschreven naar het bestand " + tekst + ".");

			printWriter.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void binaire() {
		try {
			fileOutputStream = new FileOutputStream(binaire);
			dataOutputStream = new DataOutputStream(fileOutputStream);

			for (String regel : regels) {
				dataOutputStream.writeChars(regel);
			}

			System.out.println("De regels zijn weggeschreven naar het bestand " + binaire + ".");

			dataOutputStream.close();
			fileOutputStream.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}