package edu.grupp4b.skidakare;

import edu.grupp4b.random.*;

public class SkapaSkidakare {

	 public static void Skapa() {
		 RandomStartnummer rs = new RandomStartnummer();
		 //rs();
		

		Skidakare[] skidakare = new Skidakare[5];
		for (int i = 0; i < skidakare.length; i++) {
			RandomAkarnummer ra = new RandomAkarnummer();		
			skidakare[i] = new Skidakare("Inge", "Glid" + i, "Swe", "Bollnäs IF", ra.getAkarnummer(), rs.getStartnummer());
		}
		System.out.println("5 skidåkare skapade");
		for (int i = 0; i < skidakare.length; i++) {
			System.out.println(skidakare[i]);
		}
	}
}