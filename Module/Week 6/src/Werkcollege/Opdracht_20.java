package Werkcollege;

import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht_20 {

	private static Scanner               scanner = new Scanner(System.in);
	private static ArrayList<WoordToner> woorden = new ArrayList<WoordToner>();

	private static int    aantalVerschillendeWoorden;
	private static int    aantalWoorden;
	private static String woord;

	public static void main(String[] args) {

		System.out.print("Hoeveel verschillende woorden moeten er op het scherm getoond worden: ");
		aantalVerschillendeWoorden = scanner.nextInt();

		for (int i = 0; i < aantalVerschillendeWoorden; i++) {

			System.out.print("Vul het woord in: ");
			woord = scanner.next();

			System.out.print("Hoevaak moet dit woord getoond worden: ");
			aantalWoorden = scanner.nextInt();

			woorden.add(new WoordToner(woord, aantalWoorden));
		}

		scanner.close();

		for (WoordToner toner : woorden) {
			toner.start();
		}
	}
}