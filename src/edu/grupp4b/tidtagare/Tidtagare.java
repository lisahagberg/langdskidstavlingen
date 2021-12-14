package edu.grupp4b.tidtagare;

public class Tidtagare {

	private long start;
	private long end;
	private long tim;
	private long min;
	private double milli;

	public Tidtagare() {
		start = System.nanoTime();
	}
	
	public Tidtagare(long extraTid) {
		start = System.nanoTime() - (extraTid * 1000000000);
	}

	public long getStart() {
		return start;
	}

//	public long getEnd() {
//		return end;
//	}
//
//	public void setEnd(long end) {
//		this.end = end;
//	}

	public long getTim() {
		long passeradTid = System.nanoTime() - getStart();
		tim = passeradTid / 3600000000000L;
		return tim;
	}


	public long getMin() {
		long passeradTid = System.nanoTime() - getStart();
		min = (passeradTid / 60000000000L);
		if(min > 59.999) {
			min = min % 60;
		}
		return min;
	}

	public double getMilli() {
		long passeradTid = System.nanoTime() - getStart();
		milli = (passeradTid / 1000000);
		milli = (milli / 1000);
		
		if(milli > 59.999) {
			milli = milli % 60;
		}
		return milli;
	}

	//Högst nanoTid = snabbast = vinner?
	public int compareTime() {
		end = (System.nanoTime() - getStart());
		
		return (int) end / 10000;
	}

	@Override
	public String toString() {
		String tid = String.format("%02d:%02d:%05.2f", getTim(), getMin(), getMilli());
		tid = tid.replace('.', ':');
		tid = tid.replace(',', ':');
		return tid;
	}
}