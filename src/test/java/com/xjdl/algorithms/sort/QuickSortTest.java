package com.xjdl.algorithms.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Slf4j
class QuickSortTest {

	@ParameterizedTest
	@MethodSource("com.xjdl.algorithms.sort.BubbleSortTest#provider")
	void sort(int[] arr) {
		int[] sorted = QuickSort.sort(arr, 0, arr.length - 1);

		log.debug("{}", sorted);
	}
}
