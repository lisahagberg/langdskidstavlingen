package edu.grupp4b.anmalan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.grupp4b.random.RandomStartnummer;
import edu.grupp4b.skidakare.Skidakare;

public class Registrering {

	public static void registrator() {

		Scanner scan = new Scanner(System.in);
		var akare = new ArrayList<Skidakare>();
		RandomStartnummer rs = new RandomStartnummer();
		System.out.println("Hur m�nga �kare vill du registrera?: ");
		int hej = scan.nextInt();
		for (int p = 0; p < hej; p++) {
			System.out.println("Fyll i f�ljande: F�rnamn, Efternamn, Land och Klubb: ");
			akare.add(new Skidakare(rs.getStartnummer(), scan.next(), scan.next(), scan.next(), scan.next()));

		}
		for (int i = 0; i < akare.size(); i++) {
			System.out.println(akare.get(i));
		}
	}

}
