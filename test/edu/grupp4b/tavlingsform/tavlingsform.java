package edu.grupp4b.tavlingsform;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class tavlingsform {

	static IndividuellStart is1;
	static IndividuellStart is2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		is1 = new IndividuellStart(1); // 1 ska retunera 15 sekunde
		is2 = new IndividuellStart(2); // 2 ska retunera 30 sekunder
	}

	@Test
	void testAnatalSekunderRetunerad() {
		assertEquals(15, is1.getAntalSekunder());
		assertEquals(30, is2.getAntalSekunder());
	}
}
