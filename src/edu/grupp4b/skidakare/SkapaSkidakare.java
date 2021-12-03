package edu.grupp4b.skidakare;

import edu.grupp4b.random.*;

public class SkapaSkidakare {

	 public static void Skapa() {
		 RandomStartnummer rs = new RandomStartnummer();
		 //rs();

		Skidakare[] skidakare = new Skidakare[5];
		for (int i = 0; i < skidakare.length; i++) {
			RandomAkarnummer ra = new RandomAkarnummer();		
			skidakare[i] = new Skidakare();
			skidakare[i].setFornamn("Inge ");
			skidakare[i].setEfternamn("Glid" + i);
			skidakare[i].setLand("Swe");
			skidakare[i].setKlubb("Bollnäs IF");
			skidakare[i].setAkarnummer(ra.getAkarnummer());
			skidakare[i].setStartnummer(rs.getStartnummer());
		}
		System.out.println("5 skidåkare skapade");
		for (int i = 0; i < skidakare.length; i++) {
			System.out.println(skidakare[i]);
		}
	}
}