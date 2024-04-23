package com.xjdl.algorithms.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Slf4j
class MergeSortTest {

	@ParameterizedTest
	@MethodSource("com.xjdl.algorithms.sort.BubbleSortTest#provider")
	void sortByIterative(int[] arr) {
		int[] sorted = MergeSort.sortByIterative(arr, 0, arr.length - 1);

		log.debug("{}", sorted);
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.algorithms.sort.BubbleSortTest#provider")
	void sortByRecursive(int[] arr) {
		int[] sorted = MergeSort.sortByRecursive(arr, 0, arr.length - 1);

		log.debug("{}", sorted);
	}
}
