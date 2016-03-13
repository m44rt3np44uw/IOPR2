package Werkcollege;

import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Opdracht_17 {

	private static ArrayList<Persoon> personen         = new ArrayList<Persoon>();
	private static ArrayList<Dier>    dieren           = new ArrayList<Dier>();
	private static ArrayList<Dier>    uitgelezenDieren = new ArrayList<Dier>();


	private static FileOutputStream   fileOutputStream;
	private static ObjectOutputStream objectOutputStream;

	private static FileInputStream   fileInputStream;
	private static ObjectInputStream objectInputStream;

	private static Persoon persoon;

	public static void main(String[] args) {
		schrijfPersonen();
		schrijfDieren();
		laadPersonen();
		laadDieren();
	}

	private static void laadPersonen() {
		try {
			fileInputStream   = new FileInputStream("personen.dat");
			objectInputStream = new ObjectInputStream(fileInputStream);

			while(true) {
				persoon = (Persoon)objectInputStream.readObject();
				System.out.println(persoon.naam);
			}
		}

		catch(EOFException e) {}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void laadDieren() {
		try {
			fileInputStream   = new FileInputStream("dieren.dat");
			objectInputStream = new ObjectInputStream(fileInputStream);

			while(true) {
				uitgelezenDieren.add((Dier)objectInputStream.readObject());
			}

		}

		catch(EOFException e) {}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			for (Dier dier : uitgelezenDieren) {
				System.out.println(dier.naam);
			}
		}
	}

	private static void schrijfDieren() {
		for (int i = 0; i < 5; i++) {
			dieren.add(new Dier("Dier " + (1 + i), 4, 50, true, "Woef!"));
		}

		try {
			fileOutputStream   = new FileOutputStream("dieren.dat");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			for (Dier dier : dieren) {
				objectOutputStream.writeObject(dier);
			}

			fileOutputStream.close();
			objectOutputStream.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void schrijfPersonen() {
		for (int i = 0; i < 5; i++) {
			personen.add(new Persoon("Persoon " + (1 + i), (10 + i), (190 + i), (85 + i)));
		}

		try {
			fileOutputStream   = new FileOutputStream("personen.dat");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			for (Persoon persoon : personen) {
				objectOutputStream.writeObject(persoon);
			}

			fileOutputStream.close();
			objectOutputStream.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}