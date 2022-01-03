package edu.grupp4b.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSkidakare {

	private List<String> randomSkidakare = new ArrayList<>();
	private String skidakare;

	public RandomSkidakare() {
		randomSkidakare.add("Samuel, Persson, SWE, Östersunds SK");
		randomSkidakare.add("Britta, Johansson, SWE, Östersunds SK");
		randomSkidakare.add("Lina, Korsgren, SWE, Tullus IK");
		randomSkidakare.add("Sara, Lindborg, SWE, Trönö IK");
		randomSkidakare.add("Anton, Karlsson, SWE, Mora SK");
		randomSkidakare.add("Rasmus, Petersson, SWE, Bollnäs SK");
		randomSkidakare.add("Öjvind, Meijer, NOR, Koteng DNF");
		randomSkidakare.add("Stian, Hoelgaard, NOR, Koteng DNF");
		randomSkidakare.add("Sofie, Elebro, NOR, Steinkjer IF");
		randomSkidakare.add("Erica, Kveli, FIN, Möenpöö IF");
	}

	//Retunerar en random skidåkare i listan ovan och tar bort den från listan
	public String getSkidakare() {
		Random random = new Random();
		int index = random.nextInt(randomSkidakare.size());
		skidakare = randomSkidakare.remove(index);
		 return skidakare.replace('[', ' ');
	}
}