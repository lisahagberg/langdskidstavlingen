package edu.grupp4b.skidakare;

public class SkapaSkidakare {

	 public static void Skapa() {

		Skidakare[] skidakare = new Skidakare[5];

		for (int i = 0; i < skidakare.length; i++) {
			skidakare[i] = new Skidakare();
			skidakare[i].setFornamn("Inge ");
			skidakare[i].setEfternamn("Glid" + i);
			skidakare[i].setLand("Swe");
			skidakare[i].setKlubb("Bollnäs IF");
			skidakare[i].setAkarnummer((int) (i*2.75));

		}
		System.out.println("5 skidåkare skapade");
		for (int i = 0; i < skidakare.length; i++) {
			System.out.println(skidakare[i]);
		}
	}
}