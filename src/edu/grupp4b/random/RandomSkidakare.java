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



	public String getSkidakare() {
		Random random = new Random();
		int index = random.nextInt(randomSkidakare.size());
//		System.out.println("TEST: INDEX: " + index);
//		String skidakare = randomSkidakare.toString();
//		System.out.println("TEST: SKIDAKARE: " + skidakare);
		skidakare = randomSkidakare.remove(index);
		System.out.println("TEST: SIZE: " + randomSkidakare.size());
		
		 return skidakare.replace('[', ' ');
	}
	
	
	
	
//	public String getSkidakare() {
//		Random random = new Random();
//		String[] randomSkidakare = new String[10];
//		randomSkidakare[0] = "Samuel, Persson, SWE, Östersunds SK";
//		randomSkidakare[1] = "Britta, Johansson, SWE, Östersunds SK";
//		randomSkidakare[2] = "Lina, Korsgren, SWE, Tullus IK";
//		randomSkidakare[3] = "Sara, Lindborg, SWE, Trönö IK";
//		randomSkidakare[4] = "Anton, Karlsson, SWE, Mora SK";
//		randomSkidakare[5] = "Rasmus, Petersson, SWE, Bollnäs SK ";
//		randomSkidakare[6] = "Öjvind, Meijer, NOR, Koteng DNF ";
//		randomSkidakare[7] = "Stian, Hoelgaard, NOR, Koteng DNF";
//		randomSkidakare[8] = "Sofie, Elebro, NOR, Steinkjer IF";
//		randomSkidakare[9] = "Erica, Kveli, FIN, Möenpöö IF";
//
//		int randomNumber = random.nextInt(randomSkidakare.length);
//		return randomSkidakare[randomNumber];
//	}
}