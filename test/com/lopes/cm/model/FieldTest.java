package com.lopes.cm.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FieldTest {
	
	private Field field;
	
	@BeforeEach
	void initiateField() {
		field = new Field(3,3);
	}
	
	@Test
	void testRealNeighborAtLeft() {
		Field neighbor = new Field(3,2);
		boolean result = field.addNeighbor(neighbor);
		assertTrue(result);
	}
	
	@Test
	void testRealNeighborAtRight() {
		Field neighbor = new Field(3,4);
		boolean result = field.addNeighbor(neighbor);
		assertTrue(result);
	}
	
	@Test
	void testRealNeighborAbove() {
		Field neighbor = new Field(2,3);
		boolean result = field.addNeighbor(neighbor);
		assertTrue(result);
	}
	
	@Test
	void testRealNeighborBelow() {
		Field neighbor = new Field(4,3);
		boolean result = field.addNeighbor(neighbor);
		assertTrue(result);
	}
	
	@Test
	void testRealNeighbor2() {
		Field neighbor = new Field(2,2);
		boolean result = field.addNeighbor(neighbor);
		assertTrue(result);
	}
	
	@Test
	void testFakeNeighbor() {
		Field neighbor = new Field(1,1);
		boolean result = field.addNeighbor(neighbor);
		assertFalse(result);
	}
	
}
