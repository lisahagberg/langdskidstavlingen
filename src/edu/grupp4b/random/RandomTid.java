package edu.grupp4b.random;

import java.util.Random;

public class RandomTid {
	private int tim;
	private int min;
	private Random random = new Random();

	public void setRandomTid() {
		this.tim = 10;
		this.min = random.nextInt(59);
	}

	@Override
	public String toString() {
		String resultat = String.format("RandomTid " +tim+":%02d", min);
		return resultat;
	}
	
	
	
}