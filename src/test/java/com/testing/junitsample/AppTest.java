package com.testing.junitsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testCompareString1() {
		assertEquals(1, App.CompareString("Vashi", "Vashi"));
	}
    
	@Test
	void testCompareString0() {
		assertEquals(0, App.CompareString("vashi", "Vashi"));
	}

	
	
	
}
