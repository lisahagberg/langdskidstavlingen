package edu.grupp4b.tavling;

import java.util.ArrayList;
import java.util.List;

import edu.grupp4b.skidakare.SkapaSkidakare;
import edu.grupp4b.skidakare.Skidakare;

public class Malgang {

	static List<Skidakare> malLista = new ArrayList<>();
	
	public static void registreraMal(Skidakare skidakare) {
		malLista.add(skidakare);
		SkapaSkidakare.skidakare.remove(skidakare);
	}
	
	public static void seMal() {
		for(Skidakare lista : malLista) {
			System.out.println(lista.getFornamn() + lista.getEfternamn() + " med startnummer " + lista.getStartnummer() 
			+ " gick i mål med tiden: " + lista.getTid());
		}
	}
}
