package edu.grupp4b.random;

import java.util.Random;

public class RandomAkarnummer {
	private int startnummer;
	private Random random = new Random();

	//Konstruktor sätter ett random startnummer
	public RandomAkarnummer() {
		this.startnummer = random.nextInt(999) +1;
	}
	
	@Override
	public String toString() {
		return "Startnummer: " + startnummer;
	}
}
