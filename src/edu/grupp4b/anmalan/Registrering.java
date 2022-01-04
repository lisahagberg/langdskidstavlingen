package edu.grupp4b.anmalan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import edu.grupp4b.random.RandomSkidakare;
import edu.grupp4b.random.RandomStartnummer;
import edu.grupp4b.skidakare.Skidakare;
import edu.grupp4b.tavlingsform.IndividuellStart;
import edu.grupp4b.tidtagare.Tidtagare;

public class Registrering {

	private List<Skidakare> skidakareLista;
	private Tidtagare tidtagare;
	private int antalExtraSkidakare;

	public Registrering() {
		skidakareLista = new ArrayList<>();
		setAntalExtraSkidakare(5);
	}

	public void setAntalExtraSkidakare(int extraSkidakare) {
		this.antalExtraSkidakare = extraSkidakare;
	}

	public int getAntalExtraSkidakare() {
		return antalExtraSkidakare;
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

	public void registrator() throws InterruptedException {
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
		// Lägger till extra antal skidåkare
		RandomStartnummer rndmStartNr = new RandomStartnummer(antalSkidakare + getAntalExtraSkidakare());

		for (int i = 0; i < antalSkidakare; i++) {
			System.out.println("Fyll i följande: Förnamn, Efternamn, Land och Klubb: ");
			skidakareLista.add(
					new Skidakare(rndmStartNr.getStartnummer(), scan.next(), scan.next(), scan.next(), scan.next()));
		}
		RandomSkidakare randomSkidakare = new RandomSkidakare();
		for (int i = 0; i < getAntalExtraSkidakare(); i++) {
			registreraExtraSkidakare(rndmStartNr, randomSkidakare);
		}
		System.out.println(
				antalSkidakare + " skidåkare registrerade plus " + getAntalExtraSkidakare() + " extra skidåkare");
		System.out.println("Startnummer lottas...");
		TimeUnit.SECONDS.sleep(1);
	}

	// Registrerar extra skidåkare
	public void registreraExtraSkidakare(RandomStartnummer rs, RandomSkidakare randomSkidakare) {
		String minSkidakare = randomSkidakare.getSkidakare();
		String[] namesList = minSkidakare.split(",");
		skidakareLista.add(new Skidakare(rs.getStartnummer(), namesList[0].trim(), namesList[1].trim(),
				namesList[2].trim(), namesList[3].trim()));
	}

	// Hämtar den tid som är vald (15 eller 30 sek) och adderar tiden omvänt för
	// respektive startnummer
	// Detta då skidåkarna har redan börjat åkt när programmet startar
	public void startTid(IndividuellStart is) throws InterruptedException {
		registrator();
		int sek = is.getAntalSekunder();

		for (int i = 0; i < skidakareLista.size(); i++) {
			int revNumber = reverseOrder(skidakareLista.get(i).getStartnummer());
			tidtagare = new Tidtagare((revNumber * sek) - sek);
			skidakareLista.get(i).setTid(tidtagare);
		}
		Collections.sort(skidakareLista, (Skidakare m, Skidakare n) -> m.getStartnummer() - n.getStartnummer());
		skidakareLista.forEach(skid -> {
			System.out.println("Startnummer: " + skid.getStartnummer() + ", Namn: " + skid.getFornamn() + " "
					+ skid.getEfternamn() + "\t Land: " + skid.getLand() + ", Klubb: " + skid.getKlubb());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
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
