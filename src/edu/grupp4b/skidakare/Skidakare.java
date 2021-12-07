package edu.grupp4b.skidakare;

public class Skidakare extends Person{
	
	private String land;
	private String klubb;
	private int akarnummer;
	private int startnummer;
	
	//Konstruktor
	public Skidakare(String fornamn, String efternamn, String land, String klubb, int akarnummer, int startnummer) {
		super(fornamn, efternamn);
		this.land = land;
		this.klubb = klubb;
		this.akarnummer = akarnummer;
		this.startnummer = startnummer;
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
	public int getAkarnummer() {
		return akarnummer;
	}
	public void setAkarnummer(int akarnummer) {
		this.akarnummer = akarnummer;
	}
	public int getStartnummer() {
		return startnummer;
	}
	public void setStartnummer(int startnummer) {
		this.startnummer = startnummer;
	}
	@Override
	public String toString() {
		return  "Startnummer: " + startnummer + ", Namn: " + getFornamn() + " " + getEfternamn() + ", Land: " + land + ", Klubb: " + klubb + 
				String.format(", Åkarnummer: %3d", akarnummer);
	}
}
