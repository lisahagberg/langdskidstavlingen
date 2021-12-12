package edu.grupp4b.skidakare;

import edu.grupp4b.tidtagare.Tidtagare;

public class Skidakare extends Person{
	
	private String land;
	private String klubb;
	private int startnummer;
//	private String tid;
	private Tidtagare tid;
	
	//Konstruktor
	public Skidakare(String fornamn, String efternamn, String land, String klubb, int startnummer, Tidtagare tid) {
		super(fornamn, efternamn);
		this.land = land;
		this.klubb = klubb;
		this.startnummer = startnummer;
		this.tid = tid;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getKlubb() {
		return klubb;
	}
	public void setKlubb(String klubb) {
		this.klubb = klubb;
	}
	public int getStartnummer() {
		return startnummer;
	}
	public void setStartnummer(int startnummer) {
		this.startnummer = startnummer;
	}
//	public String gettid() {
//		return tid;
//	}
//	public void settid(String tid) {
//		this.tid = tid;
//	}
	public Tidtagare getTid() {
		return tid;
	}
	public void setTid(Tidtagare tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return  "Startnummer: " + startnummer + ", Namn: " + getFornamn() + " " + getEfternamn() + ", Land: " + land
				+ ", Klubb: " + klubb + ", tid: " + tid;
	}
}
