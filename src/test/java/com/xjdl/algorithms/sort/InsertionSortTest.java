package com.xjdl.algorithms.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Slf4j
class InsertionSortTest {
	@ParameterizedTest
	@MethodSource("com.xjdl.algorithms.sort.BubbleSortTest#provider")
	void sort(int[] arr) {
		int[] sorted = InsertionSort.sort(arr);

		log.debug("{}", sorted);
	}
}
