package edu.grupp4b.tidtagare;

public class Tidtagare {

	private long start;   
	private long tim;
	private long min;

	public Tidtagare() {
		start = System.nanoTime();
	}
	
	public Tidtagare(long extraTid) {
		start = System.nanoTime() - (extraTid * 1000000000);
	}

	public String getTime() {
		long passeradTid = System.nanoTime() - start;
		double centiseconds = (passeradTid / 1000000);
		centiseconds = centiseconds / 1000;
		if(centiseconds > 59.999) {
			centiseconds = centiseconds % 60;
		}
		min = passeradTid / 60000000000L;
		tim = passeradTid / 3600000000000L;
		
		String micro = String.format("%05.2f", centiseconds);
		micro = micro.replace('.', ':');
		micro = micro.replace(',', ':');
		
		String tid = String.format("%02d:%02d:", tim, min) + micro;
		return tid;
	}
}