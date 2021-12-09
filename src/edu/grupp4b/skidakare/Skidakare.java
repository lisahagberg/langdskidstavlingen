package edu.grupp4b.skidakare;

public class Skidakare extends Person{
	
	private String land;
	private String klubb;
	private int startnummer;
	String starttid;
	
	//Konstruktor
	public Skidakare(String fornamn, String efternamn, String land, String klubb, int startnummer, String starttid) {
		super(fornamn, efternamn);
		this.land = land;
		this.klubb = klubb;
		this.startnummer = startnummer;
		this.starttid = starttid;
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
	public String getStartTid() {
		return starttid;
	}
	public void setStartTid(String starttid) {
		this.starttid = starttid;
	}
	@Override
	public String toString() {
		return  "Startnummer: " + startnummer + ", Namn: " + getFornamn() + " " + getEfternamn() + ", Land: " + land
				+ ", Klubb: " + klubb + ", Starttid: " + starttid;
	}
}
