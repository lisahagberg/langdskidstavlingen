package edu.grupp4b.skidakare;

import java.util.ArrayList;
import java.util.List;

import edu.grupp4b.random.*;
import edu.grupp4b.tavlingsform.IndividuellStart;
import edu.grupp4b.tidtagare.Tidtagare;

public class SkapaSkidakare {
	public static Tidtagare tidtagare;
	//public static Skidakare[] skidakare = new Skidakare[5];
	public static List<Skidakare> skidakare = new ArrayList<>();
	public static String time;

	public static void Skapa() {
		RandomStartnummer rs = new RandomStartnummer();

		//for (int i = 0; i < skidakare.length; i++) {
		for (int i = 0; i < 5; i++) {
			//skidakare[i] = new Skidakare("Inge", "Glid " + i, "Swe", "Bollnäs IF", rs.getStartnummer(), null);
			skidakare.add(new Skidakare("Inge", "Glid " + i, "Swe", "Bollnäs IF", rs.getStartnummer(), null));
		}

	}

	public static void startTid(IndividuellStart is) {
		Skapa();
		int sek = is.getAntalSekunder();

		//for (int i = 0; i < skidakare.length; i++) {
		for (int i = 0; i < skidakare.size(); i++) {
			//int revNumber = reverseOrder(skidakare[i].getStartnummer());
			int revNumber = reverseOrder(skidakare.get(i).getStartnummer());
			tidtagare = new Tidtagare((revNumber * sek) - sek);
			//skidakare[i].setStartTid(tidtagare.getTime());
			//skidakare[i].setStarttid(tidtagare);
			skidakare.get(i).setTid(tidtagare);
		}
		//printSkidakare();
	}

	public static void printSkidakare() {
		//for (int i = 0; i < skidakare.length; i++) {
		for (int i = 0; i < skidakare.size(); i++) {
			//System.out.println(skidakare[i]);
			System.out.println(skidakare.get(i));
		}
	}

	public static int reverseOrder(int numberToReverse) {
		//int[] reverseArray = new int[skidakare.length];
		int[] reverseArray = new int[skidakare.size()];
		int j = 0;
		//for (int i = skidakare.length - 1; i >= 0; i--) {
		for (int i = skidakare.size() - 1; i >= 0; i--) {
			reverseArray[j] = i;
			j++;
		}
		int reverseNumber = reverseArray[numberToReverse - 1];
		return reverseNumber + 1;
	}

}
