package edu.grupp4b.skidakare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.grupp4b.random.*;
import edu.grupp4b.tavlingsform.IndividuellStart;
import edu.grupp4b.tidtagare.Tidtagare;

public class SkapaSkidakare {
	public static Tidtagare tidtagare;
	public static List<Skidakare> skidakare = new ArrayList<>();
	public static String time;

	//Skapar 5 tillfälliga skidåkare för testning
	public static void Skapa() {
		RandomStartnummer rs = new RandomStartnummer();

		for (int i = 0; i < 5; i++) {
			skidakare.add(new Skidakare(rs.getStartnummer(), "Inge", "Glid ", "Swe", "Bollnäs IF"));
		}

	}

	//Hämtar antal sekunder från från objektet IndividuellStart
	public static void startTid(IndividuellStart is) {
		Skapa();
		int sek = is.getAntalSekunder();

		for (int i = 0; i < skidakare.size(); i++) {
			int revNumber = reverseOrder(skidakare.get(i).getStartnummer());
			tidtagare = new Tidtagare((revNumber * sek) - sek);
			skidakare.get(i).setTid(tidtagare);
		}
	}

	//Skriver ut skidåkare som åker just nu
	public static void printSkidakare() {
		for (int i = 0; i < skidakare.size(); i++) {
			System.out.println(skidakare.get(i));
		}
	}

	//Funktion för att vända på lista, exempel med 5 skidåkare
	//börjar skidåkare med startnummer 1 först
	public static int reverseOrder(int numberToReverse) {
		int[] reverseArray = new int[skidakare.size()];
		int j = 0;
		for (int i = skidakare.size() - 1; i >= 0; i--) {
			reverseArray[j] = i;
			j++;
		}
		int reverseNumber = reverseArray[numberToReverse - 1];
		return reverseNumber + 1;
	}

}
