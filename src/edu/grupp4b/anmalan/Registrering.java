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

	private List<Skidakare> skidakareLista;
	private Tidtagare tidtagare;
	private int extraSkidakare;

	public Registrering() {
		skidakareLista = new ArrayList<>();
		setExtraSkidakare(3);
	}

	public void setExtraSkidakare(int extraSkidakare) {
		this.extraSkidakare = extraSkidakare;
	}

	public int getExtraSkidakare() {
		return extraSkidakare;
	}

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

		System.out.print("Hur många åkare vill du registrera?: ");
		int antalSkidakare = 0;
		while (true) {
			try {
				antalSkidakare = scan.nextInt();
				while (antalSkidakare < 0) {
					System.out.println("Negativt värde, försök igen.");
					antalSkidakare = scan.nextInt();
				}
				break;
			} catch (Exception ex) {
				scan.nextLine();
				System.out.println("Felaktig inmatning");
			}
		}

		RandomStartnummer rndmStartNr = new RandomStartnummer(antalSkidakare + getExtraSkidakare()); // Lägger till extra
																							// skidåkare

		for (int i = 0; i < antalSkidakare; i++) {
			System.out.println("Fyll i följande: Förnamn, Efternamn, Land och Klubb: ");
			skidakareLista.add(new Skidakare(rndmStartNr.getStartnummer(), scan.next(), scan.next(), scan.next(),
					scan.next()));
		}
		for (int i = 0; i < getExtraSkidakare(); i++) {
			registreraExtraSkidakare(rndmStartNr);
		}
		System.out.println(antalSkidakare + " skidåkare registrerade plus " + getExtraSkidakare() + " extra skidåkare");
	}

	public void registreraExtraSkidakare(RandomStartnummer rs) {
		RandomSkidakare randomSkidakare = new RandomSkidakare();

		String minSkidakare = randomSkidakare.getSkidakare();
		String[] namesList = minSkidakare.split(",");
		skidakareLista.add(new Skidakare(rs.getStartnummer(), namesList[0].trim(), namesList[1].trim(),
				namesList[2].trim(), namesList[3].trim()));
	}

	public void startTid(IndividuellStart is) {
		registrator();
		int sek = is.getAntalSekunder();

		for (int i = 0; i < skidakareLista.size(); i++) {
			int revNumber = reverseOrder(skidakareLista.get(i).getStartnummer());
			tidtagare = new Tidtagare((revNumber * sek) - sek);
			skidakareLista.get(i).setTid(tidtagare);
		}
		printSkidakare();
	}

	// Funktion för att vända på lista, exempel med 5 skidåkare
	// börjar skidåkare med startnummer 1 först
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

	public void printSkidakare() {
		Collections.sort(skidakareLista, (Skidakare m, Skidakare n) -> m.getStartnummer() - n.getStartnummer());
		skidakareLista.forEach(skid -> System.out.println(skid));
	}
}
