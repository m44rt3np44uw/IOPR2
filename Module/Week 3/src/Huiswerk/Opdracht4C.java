package Huiswerk;

import java.util.ArrayList;

public class Opdracht4C {

	public static ArrayList<Pizza> allePizzas = new ArrayList<Pizza>();

	public static void main(String[] args) {
		allePizzas.add(new Bolognese());
		allePizzas.add(new Calzone());
		allePizzas.add(new QuattroStagionni());
		allePizzas.add(new Tonno());

		allePizzas.add(new Hawaii());

		for (Pizza pizza : allePizzas) {
			System.out.println("De pizza " + pizza.getNaam() + " is €" + pizza.getPrijs());
		}
	}
}