package com.revature.dsa.doublylinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.dsa.singlylinkedlist.SinglyLinkedList;

class TestDoublyLinkedList {

	public DoublyLinkedList<Integer> listWithFiveItems() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		return list;
	}

	@Test
	void testSize1() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		assertEquals(0, list.getSize());
	}
	
	@Test
	void testSize2() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		assertEquals(5, list.getSize());
	}
	
	@Test
	void testContains1() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		assertTrue(list.contains(30));
	}

	@Test
	void testContains2() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		assertFalse(list.contains(90));
	}
	
	@Test
	void testToString() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		assertEquals("NULL <- | 10 | <-> | 20 | <-> | 30 | <-> | 40 | <-> | 50 | -> NULL\n", list.toString());
	}
	
	@Test
	void testInsert1() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.insert(0, 10);
		assertEquals("NULL <- | 10 | -> NULL\n", list.toString());
	}
	
	@Test
	void testInsert2() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		list.insert(2, 25);
		assertEquals("NULL <- | 10 | <-> | 20 | <-> | 25 | <-> | 30 | <-> | 40 | <-> | 50 | -> NULL\n", list.toString());
	}

	@Test
	void testInsert3() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		list.insert(5, 55);
		assertEquals("NULL <- | 10 | <-> | 20 | <-> | 30 | <-> | 40 | <-> | 50 | <-> | 55 | -> NULL\n", list.toString());
	}

	@Test
	void testInsert4() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.insert(6, 55);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	@Test
	void testInsert5() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.insert(-1, 55);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testDelete1() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		list.delete(0);
		assertEquals("NULL <- | 20 | <-> | 30 | <-> | 40 | <-> | 50 | -> NULL\n", list.toString());
	}

	@Test
	void testDelete2() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		list.delete(2);
		assertEquals("NULL <- | 10 | <-> | 20 | <-> | 40 | <-> | 50 | -> NULL\n", list.toString());
	}

	@Test
	void testDelete3() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		list.delete(4);
		assertEquals("NULL <- | 10 | <-> | 20 | <-> | 30 | <-> | 40 | -> NULL\n", list.toString());
	}

	@Test
	void testDelete4() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.delete(-1);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

	@Test
	void testDelete5() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.delete(5);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testGet1() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		assertEquals(10, list.get(0));
	}
	
	@Test
	void testGet2() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		assertEquals(40, list.get(3));
	}
	
	@Test
	void testGet3() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		assertEquals(50, list.get(4));
	}
	
	@Test
	void testGet4() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.get(-1);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testGet5() {
		DoublyLinkedList<Integer> list = listWithFiveItems();
		try {
			list.get(5);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}

}
