package edu.grupp4b.anmalan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.grupp4b.random.RandomSkidakare;
import edu.grupp4b.random.RandomStartnummer;
import edu.grupp4b.skidakare.Skidakare;

public class Registrering {
	List<Skidakare> akare = new ArrayList<Skidakare>();

	public void registrator() {

		Scanner scan = new Scanner(System.in);
		RandomStartnummer rs = new RandomStartnummer();
		System.out.println("Hur m�nga �kare vill du registrera?: ");
		int hej = scan.nextInt();
		for (int p = 0; p < hej; p++) {
			System.out.println("Fyll i f�ljande: F�rnamn, Efternamn, Land och Klubb: ");
			akare.add(new Skidakare(rs.getStartnummer(), scan.next(), scan.next(), scan.next(), scan.next()));
		}
		for (int i = 0; i < 3; i++) {
			registreraExtraSkidakare(rs);
		}
	}
	public void registreraExtraSkidakare(RandomStartnummer rs) {
		RandomSkidakare rSkidakare = new RandomSkidakare();
		
		String minSkidakare = rSkidakare.getSkidakare();
		String[] namesList = minSkidakare.split(",");
		for(int i = 0; i < namesList.length; i++) {
			akare.add(new Skidakare(rs.getStartnummer(), namesList[0], namesList[1], namesList[2], namesList[3]));
		}

	}

}
