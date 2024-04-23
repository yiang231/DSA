package com.xjdl.algorithms.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
	static Stream<Arguments> provider() {
		int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
		int target = 147;
		return Stream.of(
				Arguments.of(arr, target)
		);
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.algorithms.search.BinarySearchTest#provider")
	void find(int[] arr, int target) {
		int byIterative = BinarySearch.findByIterative(arr, target, 0, arr.length - 1);
		int byRecursive = BinarySearch.findByRecursive(arr, target, 0, arr.length - 1);

		assertEquals(byIterative, byRecursive);
	}
}
