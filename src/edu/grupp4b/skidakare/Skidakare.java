package edu.grupp4b.skidakare;

import edu.grupp4b.tidtagare.Tidtagare;

public class Skidakare extends Person implements Comparable<Skidakare>{

	private String land;
	private String klubb;
	private int startnummer;
	private Tidtagare tid;
	private String finalTid;

	/**
	 * 
	 * @param startnummer
	 * @param fornamn
	 * @param efternamn
	 * @param land
	 * @param klubb
	 */
	
	//Konstruktor
	public Skidakare(int startnummer, String fornamn, String efternamn, String land, String klubb) {
		super(fornamn, efternamn);
		this.land = land;
		this.klubb = klubb;
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
	public int getStartnummer() {
		return startnummer;
	}
	public void setStartnummer(int startnummer) {
		this.startnummer = startnummer;
	}
	public Tidtagare getTid() {
		return tid;
	}
	public void setTid(Tidtagare tid) {
		this.tid = tid;
	}
	public String getFinalTid() {
		return finalTid;
	}
	public void setFinalTid(String finalTid) {
		this.finalTid = getTid().toString();
	}
	public int compareTid() {
		String tid = getFinalTid();
		tid = tid.replace(":", "");
		return Integer.parseInt(tid);
	}
	@Override
	public String toString() {
		return  "Startnummer: " + startnummer + ", Namn: " + getFornamn() + " "
		+ getEfternamn() + "\t" + "Land: " + land + ", Klubb: " + klubb + "\t" + "Tid: " + tid;
	}
	@Override
	public int compareTo(Skidakare annan) {
		if(compareTid() > annan.compareTid()) {
			return 1;
		} else {
			return -1;
		}
	}
}
