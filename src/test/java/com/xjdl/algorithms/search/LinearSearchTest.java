package com.xjdl.algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinearSearchTest {

	@Test
	void find() {
		int[] arr = {1301, 1301, 127, 147, 81, 103, 1301, 7, 79};
		int num = 81;

		int result = LinearSearch.find(arr, num);

		assertEquals(result, 4);
	}

	@Test
	void findAll() {
		int[] arr = {131, 11, 127, 147, 81, 103, 131, 7, 79};
		int num = 131;

		int[] result = LinearSearch.findAll(arr, num);

		assertArrayEquals(result, new int[]{0, 6});
	}
}
