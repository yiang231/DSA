package com.xjdl.algorithms.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterpolationSearchTest {
	@ParameterizedTest
	@MethodSource("com.xjdl.algorithms.search.BinarySearchTest#provider")
	void find(int[] arr, int target) {
		int byIterative = InterpolationSearch.findByIterative(arr, target, 0, arr.length - 1);
		int byRecursive = InterpolationSearch.findByRecursive(arr, target, 0, arr.length - 1);

		assertEquals(byIterative, byRecursive);
	}
}
