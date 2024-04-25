package com.xjdl.leetcode.array;

import com.xjdl.utils.DSAUtils;

/**
 * <a href="https://leetcode.cn/problems/minimum-size-subarray-sum/description/">minimum-size-subarray-sum</a>
 */
public class LC209 {
	public static int minSubarrayLengthBruteForce(int[] nums, int target) {
		int result = Integer.MAX_VALUE, sum, subLen;

		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum >= target) {
					subLen = j - i + 1;
					result = Math.min(result, subLen);
					DSAUtils.printArray(nums, i, j);
					break;
				}
			}
		}
		return result == Integer.MAX_VALUE ? 0 : result;
	}

	/**
	 * 滑动窗口，就是不断的调节子序列的起始位置和终止位置
	 */
	public static int minSubarrayLengthSlidingWindow(int[] nums, int target) {
		int sum = 0, l = 0, result = Integer.MAX_VALUE;

		for (int r = 0; r < nums.length; r++) {
			sum += nums[r];
			while (sum >= target) {
				DSAUtils.printArray(nums, l, r, true);
				result = Math.min(result, r - l + 1);
				sum -= nums[l++];
			}
		}
		return result == Integer.MAX_VALUE ? 0 : result;
	}
}
