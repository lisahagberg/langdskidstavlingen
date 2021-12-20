package edu.grupp4b.skidakare;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SkidakareTest {
	
	static Skidakare skidakare;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		skidakare = new Skidakare(7, "Bjarne", "Nilsen", "Norsk", "Klappertask");
	}

	@Test
	void testSkidakare() {
		assertEquals(7, skidakare.getStartnummer());
		assertEquals("Bjarne", skidakare.getFornamn());
		assertEquals("Nilsen", skidakare.getEfternamn());
		assertEquals("Klappertask", skidakare.getKlubb());
		assertEquals("Norsk", skidakare.getLand());
		assertEquals(null, skidakare.getTid());
	}

}
