package com.xjdl.algorithms.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSearchTest {
	@ParameterizedTest
	@MethodSource("com.xjdl.algorithms.search.BinarySearchTest#provider")
	void find(int[] arr, int target) {
		int result = FibonacciSearch.find(arr, target);

		assertEquals(7, result);
	}
}
