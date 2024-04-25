package com.xjdl.leetcode.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class LC209Test {
	@Test
	void minSubArrayLen() {
		int[] nums = {2, 3, 1, 2, 4, 3};

		int bruteForce = LC209.minSubarrayLengthBruteForce(nums, 7);
		int slidingWindow = LC209.minSubarrayLengthSlidingWindow(nums, 7);

		assertEquals(bruteForce, slidingWindow);
	}
}
