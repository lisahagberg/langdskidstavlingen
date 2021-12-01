package edu.grupp4b.random;

import java.util.Random;

public class RandomTid {
	private int tim;
	private int min;
	private int sek;
	private Random random = new Random();

	//Konstruktor sätter tid klockan 10 och random minuter
	public RandomTid() {
		this.tim = 10;
		this.min = random.nextInt(59);
		this.sek = random.nextInt(59);
	}

	@Override
	public String toString() {
		String resultat = String.format("RandomTid " +tim+":%02d:%02d", min, sek);
		return resultat;
	}
	
	
	
}