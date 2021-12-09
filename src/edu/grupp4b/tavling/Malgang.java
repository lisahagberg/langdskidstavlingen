package edu.grupp4b.tavling;

import java.util.ArrayList;
import java.util.List;

import edu.grupp4b.skidakare.Skidakare;

public class Malgang {

	static List<Skidakare> myList = new ArrayList<>();
	
	public static void registreraMal(Skidakare skidakare) {
		myList.add(skidakare);
	}
	
	public static void seMal() {
		for(Skidakare lista : myList) {
			System.out.println(lista);
		}
	}
}
