package edu.grupp4b.tavling;

import java.util.ArrayList;
import java.util.List;

import edu.grupp4b.skidakare.SkapaSkidakare;
import edu.grupp4b.skidakare.Skidakare;

public class Malgang {
	
	List<Skidakare> malLista = new ArrayList<>();
	
	public void registreraMal(Skidakare skidakare) {
		malLista.add(skidakare);
		SkapaSkidakare.skidakare.remove(skidakare);
	}
	
	public void seMal() {
		int placering = 1;
		for(Skidakare lista : malLista) {
			System.out.println(lista.getFornamn() + " " + lista.getEfternamn() 
			+ " med startnummer " + lista.getStartnummer() + " gick i mål med tiden: " + lista.getTid() 
			+ " hamnade på " + placering + stringPlacering(placering) + " plats.");
			placering++;
		}
	}
	private String stringPlacering(int platsNummer) {
		if(platsNummer == 1 || platsNummer == 2) {
			return ":a";
		}
		return ":e";
	}
}
