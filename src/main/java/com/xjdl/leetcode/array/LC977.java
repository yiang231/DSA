package com.xjdl.leetcode.array;

/**
 * <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/description/">squares-of-a-sorted-array</a>
 */
public class LC977 {
	public static int[] sortedSquares(int[] nums) {
		int lp = 0, rp = nums.length - 1, index = rp;
		int[] result = new int[nums.length];

		while (lp <= rp) {
			if (nums[lp] * nums[lp] > nums[rp] * nums[rp]) {
				result[index--] = nums[lp] * nums[lp++];
			} else {
				result[index--] = nums[rp] * nums[rp--];
			}
		}
		return result;
	}
}
