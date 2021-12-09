package edu.grupp4b.huvudklass;

import java.util.Scanner;

import edu.grupp4b.anmalan.Anmalan;
import edu.grupp4b.skidakare.SkapaSkidakare;
import edu.grupp4b.tavling.Malgang;
import edu.grupp4b.tidtagare.Tidtagare;

public class Main {

	public static void main(String[] args) {

		Tidtagare tidtagare = new Tidtagare();
		Anmalan.registrering();
		SkapaSkidakare.Skapa();
		SkapaSkidakare.startTid(Anmalan.getIs());
		Scanner scanner = new Scanner(System.in);
		boolean runMenu = true;
		while(runMenu) {
		System.out.println("\nAnge startnummer för åkare du vill kontrollera:");
		System.out.print("Val: ");
		int startnr = scanner.nextInt();
		System.out.println("\n[1] Kolla mellantid\n[2] Registrera målgång\n"
				+ "[3] Se lista över målgång\n[4] System exit");
		System.out.print("Val: ");
		
	    switch(scanner.next()) {
	    case "1" -> {}
	    case "2" -> {
	    	for(int i = 0; i < SkapaSkidakare.skidakare.length; i++) {
	    		if(SkapaSkidakare.skidakare[i].getStartnummer() == startnr) {
	    			Malgang.registreraMal(SkapaSkidakare.skidakare[i]);
	    		}
	    	}
	    	
	    	}
	    case "3" -> {
	    	Malgang.seMal();
	    	}
	    case "4" -> {
	    	System.out.println("Avslutar program");
	    	System.exit(0);
	    	}
	    }
		}
		tidtagare.getTime();
		
		scanner.close();
	}	
}