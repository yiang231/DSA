package com.xjdl.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
class DSAUtilsTest {
	@Test
	void getFibonacciArray() {
		int[] fibonacciArray = DSAUtils.getFibonacciArray(11);

		log.debug("{}", fibonacciArray);
	}

	@Test
	void copyOf() {
		int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

		int[] dest = DSAUtils.copyOf(arr, 12);

		log.debug("{}", dest);
	}

	@Test
	void arraycopy() {
		int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
		int[] dest = {2, 3, 4, 5, 6};

		int[] destResult = DSAUtils.arraycopy(arr, 5, dest, 2, 3);

		log.debug("{}", destResult);
	}

	@Test
	void getHibbardSequence() {
		List<Integer> hibbardSequence = DSAUtils.getHibbardSequence(10000);
		log.debug("{}", hibbardSequence);
	}

	@Test
	void getSedgewickSequence() {
		List<Integer> sedgewickSequence = DSAUtils.getSedgewickSequence(10000);
		log.debug("{}", sedgewickSequence);
	}
}
