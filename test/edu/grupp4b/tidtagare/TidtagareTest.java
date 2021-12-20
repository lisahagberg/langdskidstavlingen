package edu.grupp4b.tidtagare;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TidtagareTest {

	static Tidtagare tid;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tid = new Tidtagare();
		Thread.sleep(5000);
	}
	
	@Test
	void testMilliSeconds() {
		int sec = (int) tid.getMilli();
		assertEquals(5, sec);
		assertTrue(sec >= 5);
	}
}