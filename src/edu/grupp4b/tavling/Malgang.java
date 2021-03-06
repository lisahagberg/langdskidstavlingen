package edu.grupp4b.tavling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.grupp4b.skidakare.Skidakare;

public class Malgang {

	List<Skidakare> malLista = new ArrayList<>();

	// Registrerar skidåkare i ny lista som har gått i mål
	// Tar bort skidåkare från första lista som "åker just nu"
	public void registreraMal(Skidakare skidakare) {
		malLista.add(skidakare);
		skidakare.setFinalTid(skidakare.getTid().toString());
		skidakare.compareTid();
	}

	// Skriver ut målgångslista med diverse egenskaper samt placering
	public void seMal() {
		int placering = 1;

		// Sorterar lista beroende på snabbast tid
		Collections.sort(malLista);
		if (malLista.isEmpty()) {
			System.out.println("Ingen målgång är för tillfället registrerad.");
		} else {
			for (Skidakare skidakareLista : malLista) {
				System.out.println(skidakareLista.getFornamn() + " " + skidakareLista.getEfternamn()
						+ " med startnummer " + skidakareLista.getStartnummer() + " gick i mål med tiden: "
						+ skidakareLista.getFinalTid() + " hamnade på " + placering + stringPlacering(placering)
						+ " plats.");
				placering++;
			}
		}
	}

	String stringPlacering(int platsNummer) {
		if (platsNummer == 1 || platsNummer == 2) {
			return ":a";
		}
		return ":e";
	}
}
