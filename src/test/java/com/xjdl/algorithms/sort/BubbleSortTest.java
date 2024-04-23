package com.xjdl.algorithms.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Slf4j
class BubbleSortTest {

	static Stream<Arguments> provider() {
		int[] arr = {9, 8, 7, 6, 6, 5, 4, 3, 2, 1, 0};
		return Stream.of(
				Arguments.of(arr)
		);
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.algorithms.sort.BubbleSortTest#provider")
	void sort(int[] arr) {
		int[] sorted = BubbleSort.sort(arr);

		log.debug("{}", sorted);
	}
}
