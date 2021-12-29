package edu.grupp4b.anmalan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import edu.grupp4b.random.RandomSkidakare;
import edu.grupp4b.random.RandomStartnummer;
import edu.grupp4b.skidakare.Skidakare;
import edu.grupp4b.tavlingsform.IndividuellStart;
import edu.grupp4b.tidtagare.Tidtagare;

public class Registrering {
	
	private List<Skidakare> skidakareLista = new ArrayList<Skidakare>();
	private Tidtagare tidtagare;

	public List<Skidakare> getSkidakareLista() {
		return skidakareLista;
	}
	
	
	
	public Tidtagare getTidtagare() {
		return tidtagare;
	}

	public void setTidtagare(Tidtagare tidtagare) {
		this.tidtagare = tidtagare;
	}





	public void registrator() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hur m�nga �kare vill du registrera?: ");
		int antalSkidakare = scan.nextInt();
		RandomStartnummer rs = new RandomStartnummer(antalSkidakare +3); //Lägger till 3 extra skidåkare
		System.out.println("TEST: Antal Skidåkare att registrera manuellt" + antalSkidakare);
		for (int i = 0; i < antalSkidakare; i++) {
			System.out.println("Fyll i f�ljande: F�rnamn, Efternamn, Land och Klubb: ");
			skidakareLista.add(new Skidakare(rs.getStartnummer(), scan.next(), scan.next(), scan.next(), scan.next()));
		}
		for (int i = 0; i < 3; i++) {
			registreraExtraSkidakare(rs);
		}
	}
	public void registreraExtraSkidakare(RandomStartnummer rs) {
		RandomSkidakare randomSkidakare = new RandomSkidakare();
		
		String minSkidakare = randomSkidakare.getSkidakare();
		String[] namesList = minSkidakare.split(",");
			skidakareLista.add(new Skidakare(rs.getStartnummer(), namesList[0].trim(), namesList[1].trim(), 
					namesList[2].trim(), namesList[3].trim()));
	}
	
	
	public void startTid(IndividuellStart is) {
//		Skapa();
		registrator();
		int sek = is.getAntalSekunder();

		for (int i = 0; i < skidakareLista.size(); i++) {
			int revNumber = reverseOrder(skidakareLista.get(i).getStartnummer());
			tidtagare = new Tidtagare((revNumber * sek) - sek);
			skidakareLista.get(i).setTid(tidtagare);
		}
	}
	
	//Funktion för att vända på lista, exempel med 5 skidåkare
	//börjar skidåkare med startnummer 1 först
	public int reverseOrder(int numberToReverse) {
		int[] reverseArray = new int[skidakareLista.size()];
		int j = 0;
		for (int i = skidakareLista.size() - 1; i >= 0; i--) {
			reverseArray[j] = i;
			j++;
		}
		int reverseNumber = reverseArray[numberToReverse - 1];
		return reverseNumber + 1;
	}
	
	final Comparator<Skidakare> VIA_STARTNUMMER =
			  new Comparator<Skidakare>() {

				@Override
				public int compare(Skidakare skid1, Skidakare skid2) {
					if(skid1.getStartnummer() > skid2.getStartnummer()) {
						return 1;
					} else {
						return -1;
					}
				}
			  };
	
	
	public void printSkidakare() {
	Collections.sort(skidakareLista, VIA_STARTNUMMER);
	
	for(Skidakare skid : skidakareLista) {
		System.out.println(skid);
	}

	
}

}
