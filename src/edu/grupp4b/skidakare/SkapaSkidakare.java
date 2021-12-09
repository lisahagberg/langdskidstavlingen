package edu.grupp4b.skidakare;

import edu.grupp4b.random.*;
import edu.grupp4b.tavlingsform.IndividuellStart;
import edu.grupp4b.tidtagare.Tidtagare;


public class SkapaSkidakare {

	public static Skidakare[] skidakare = new Skidakare[5];
	
	 public static void Skapa() {
		 RandomStartnummer rs = new RandomStartnummer();
		 //rs();
	
		//Skidakare[] skidakare = new Skidakare[5];
		for (int i = 0; i < skidakare.length; i++) {
			RandomAkarnummer ra = new RandomAkarnummer();		
			skidakare[i] = new Skidakare("Inge", "Glid " + i, "Swe", "Bollnäs IF", ra.getAkarnummer(), rs.getStartnummer());
		}
		System.out.println("\n5 skidåkare skapade");
		for (int i = 0; i < skidakare.length; i++) {
			System.out.println(skidakare[i]);
		}
	 }
		
		public static void startTid(IndividuellStart is) {
			
			int sek = is.getAntalSekunder();
			for (int i = 0; skidakare.length > i; i--) {
				Tidtagare t = new Tidtagare(skidakare[i].getStartnummer() * sek);
				
				System.out.println(t);
				
			}
		  }
		}
	
	 
	 
	 
	 
	 


