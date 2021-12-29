package edu.grupp4b.random;

import java.util.Random;

public class RandomSkidakare {

	public String getSkidakare() {
		Random random = new Random();
		String[] randomSkidakare = new String[10];
		randomSkidakare[0] = "Samuel, Persson, SWE, Östersunds SK";
		randomSkidakare[1] = "Britta, Johansson, SWE, Östersunds SK";
		randomSkidakare[2] = "Lina, Korsgren, SWE, Tullus IK";
		randomSkidakare[3] = "Sara, Lindborg, SWE, Trönö IK";
		randomSkidakare[4] = "Anton, Karlsson, SWE, Mora SK";
		randomSkidakare[5] = "Rasmus, Petersson, SWE, Bollnäs SK ";
		randomSkidakare[6] = "Öjvind, Meijer, NOR, Koteng DNF ";
		randomSkidakare[7] = "Stian, Hoelgaard, NOR, Koteng DNF";
		randomSkidakare[8] = "Sofie, Elebro, NOR, Steinkjer IF";
		randomSkidakare[9] = "Erica, Kveli, FIN, Möenpöö IF";

		int randomNumber = random.nextInt(randomSkidakare.length);
		return randomSkidakare[randomNumber];
	}
}