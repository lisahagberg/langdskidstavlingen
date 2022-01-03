package edu.grupp4b.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStartnummer {
	
	private int startnummer;
	private int listSize;	
	private List<Integer> startnummerLista = new ArrayList<Integer>(listSize);
	
	/**
	 * 
	 * @param listaStorlek - Storlek på lista för att dela ut startnummer
	 */
	
	//Konstruktor
	//Skapar en lista beroende på hur många skidåkare som är med i tävling
	public RandomStartnummer(int listaStorlek) {
		super();
		this.listSize = listaStorlek;
		for(int i = 1; i <= listaStorlek; i++) {
			startnummerLista.add(i);
		}
	}

	public void setMySize(int mySize) {
		this.listSize = mySize;
	}

	//Retunerar ett random startnummer och tar bort det ur listan (så det ej kan användas igen)
	public int getStartnummer() {
		Random rand = new Random();
		int index = rand.nextInt(startnummerLista.size());
		return startnummer = startnummerLista.remove(index);
	}
}
