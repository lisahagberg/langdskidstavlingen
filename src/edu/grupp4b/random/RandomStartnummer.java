package edu.grupp4b.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStartnummer {
	
	private int startnummer;
	private int listSize;	
	private List<Integer> startnummerLista = new ArrayList<Integer>(listSize);
	
	//Konstruktor
	public RandomStartnummer(int mySize) {
		super();
		this.listSize = mySize;
		for(int i = 1; i <= mySize; i++) {
			startnummerLista.add(i);
		}
		System.out.println("TEST: Storlek på SkidakarLista: " + startnummerLista.size());
	}

	public void setMySize(int mySize) {
		this.listSize = mySize;
	}

	
	public int getStartnummer() {
		Random rand = new Random();
		int index = rand.nextInt(startnummerLista.size());
		return startnummer = startnummerLista.remove(index);
	}
}
