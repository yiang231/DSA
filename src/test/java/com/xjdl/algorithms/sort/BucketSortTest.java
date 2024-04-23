package com.xjdl.algorithms.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class BucketSortTest {

	@Test
	void sort() {
		float[] arr = {(float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52
				, (float) 0.37, (float) 0.47, (float) 0.51};

		float[] sorted = BucketSort.sort(arr, arr.length);

		log.debug("{}", sorted);
	}
}
