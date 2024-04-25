package com.xjdl.leetcode.array;

/**
 * <a href="https://leetcode.cn/problems/binary-search/description/">binary-search</a>
 */
public class LC704 {
	/**
	 * [left, right]
	 */
	public static int binarySearchInclusiveBounds(int[] nums, int target) {
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int middle = (left + right) >>> 1;

			if (target < nums[middle]) {
				right = middle - 1;
			} else if (target > nums[middle]) {
				left = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

	/**
	 * [left, right)
	 */
	public static int binarySearchWithSingleBound(int[] nums, int target) {
		int left = 0, right = nums.length;

		while (left < right) {
			int middle = (left + right) >>> 1;
			if (target < nums[middle]) {
				right = middle;
			} else if (target > nums[middle]) {
				left = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}
}
