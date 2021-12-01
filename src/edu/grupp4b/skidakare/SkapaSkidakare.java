package edu.grupp4b.skidakare;

public class SkapaSkidakare {
	
	public static void Skapa() {

		Skidakare[] skidakare = new Skidakare[5];

		for (int i = 0; i < skidakare.length; i++) {
			skidakare[i].setFornamn("Åkare");
			skidakare[i].setEfternamn(": " + i);
			skidakare[i].setLand("Swe");
			skidakare[i].setKlubb("Bollnäs IF");
		}
		
		for (int i = 0; i < skidakare.length; i++) {
			skidakare[i].getFornamn();
			skidakare[i].getEfternamn();
			skidakare[i].getLand();
			skidakare[i].getKlubb();
		
		}
	
	}
}