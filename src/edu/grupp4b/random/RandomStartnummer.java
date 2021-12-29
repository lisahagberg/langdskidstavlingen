package edu.grupp4b.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStartnummer {
	
	private int startnummer;
	private int mySize;	
	private List<Integer> myList = new ArrayList<Integer>(mySize);
	
	//Konstruktor
	public RandomStartnummer(int mySize) {
		super();
		this.mySize = mySize;
		for(int i = 1; i <= mySize; i++) {
			myList.add(i);
		}
		System.out.println("TEST: Storlek på SkidakarLista: " + myList.size());
	}

	public void setMySize(int mySize) {
		this.mySize = mySize;
	}

	
	public int getStartnummer() {
		Random rand = new Random();
		int index = rand.nextInt(myList.size());
		return startnummer = myList.remove(index);
	}
}
