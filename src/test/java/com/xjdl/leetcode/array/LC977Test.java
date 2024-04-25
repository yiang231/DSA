package com.xjdl.leetcode.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class LC977Test {

	@Test
	void SortedSquares() {
		int[] nums = {-4, -1, 0, 3, 10};

		int[] result = LC977.sortedSquares(nums);

		log.debug("{}", result);
	}
}
