package edu.grupp4b.skidakare;

import edu.grupp4b.random.*;
import edu.grupp4b.tavlingsform.IndividuellStart;
import edu.grupp4b.tidtagare.Tidtagare;

public class SkapaSkidakare {
	public static Tidtagare tidtagare;
	public static Skidakare[] skidakare = new Skidakare[5];
	public static String time;

	public static void Skapa() {
		RandomStartnummer rs = new RandomStartnummer();

		for (int i = 0; i < skidakare.length; i++) {
			// RandomAkarnummer ra = new RandomAkarnummer();
			//skidakare[i] = new Skidakare("Inge", "Glid " + i, "Swe", "Bollnäs IF", rs.getStartnummer(), getTime());
			skidakare[i] = new Skidakare("Inge", "Glid " + i, "Swe", "Bollnäs IF", rs.getStartnummer(), null);
		}

	}

	public static void startTid(IndividuellStart is) {
		Skapa();
		int sek = is.getAntalSekunder();

		for (int i = 0; i < skidakare.length; i++) {
			int revNumber = reverseOrder(skidakare[i].getStartnummer());
			tidtagare = new Tidtagare((revNumber * sek) - sek);
			//skidakare[i].setStartTid(tidtagare.getTime());
			skidakare[i].setStarttid(tidtagare);
		}
		//printSkidakare();
	}

	public static void printSkidakare() {
		for (int i = 0; i < skidakare.length; i++) {
			System.out.println(skidakare[i]);
		}
	}

	public static int reverseOrder(int numberToReverse) {
		int[] reverseArray = new int[skidakare.length];
		int j = 0;
		for (int i = skidakare.length - 1; i >= 0; i--) {
			reverseArray[j] = i;
			j++;
		}
		int reverseNumber = reverseArray[numberToReverse - 1];
		return reverseNumber + 1;
	}

}
