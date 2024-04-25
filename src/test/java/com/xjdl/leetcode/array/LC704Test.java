package com.xjdl.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * 有序数组，且无重复元素
 */
class LC704Test {
	@Test
	void search() {
		int[] nums = {-1, 0, 3, 5, 9, 12};

		int inclusiveBounds = LC704.binarySearchInclusiveBounds(nums, 9);
		int exclusiveRightBound = LC704.binarySearchWithSingleBound(nums, 9);

		assertEquals(inclusiveBounds, exclusiveRightBound);
	}
}
