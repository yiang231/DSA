package com.xjdl.leetcode.array;

/**
 * 数组的元素在内存地址中是连续的，不能单独删除数组中的某个元素，只能覆盖
 * <p>
 * <a href="https://leetcode.cn/problems/remove-element/description/">remove-element</a>
 */
public class LC27 {

	/**
	 * 循环替换
	 */
	public static int removeElementByLoop(int[] nums, int val) {
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			if (val == nums[i]) {
				for (int j = i + 1; j < length; j++) {
					nums[j - 1] = nums[j];
				}
				i--;
				length--;
			}
		}
		return length;
	}

	/**
	 * 双指针【同向】
	 */
	public static int removeElementByTwoPointersSameDirection(int[] nums, int val) {
		int sp = 0;

		for (int fp = 0; fp < nums.length; fp++) {
			if (val != nums[fp]) {
				nums[sp++] = nums[fp];
			}
		}
		return sp;
	}

	/**
	 * 双指针【相向】
	 */
	public static int removeElementByTwoPointersOppositeDirection(int[] nums, int val) {
		int lp = 0, rp = nums.length - 1;

		while (lp <= rp) {
			while (nums[lp] != val && lp <= rp) {
				++lp;
			}
			while (nums[rp] == val && lp <= rp) {
				--rp;
			}
			if (lp < rp) {
				nums[lp++] = nums[rp--];
			}
		}
		return lp;
	}

	/**
	 * 双指针【相向】
	 */
	public static int removeElementByTwoPointersOppositeDirectionOptimized(int[] nums, int val) {
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			if (nums[left] == val) {
				nums[left] = nums[right--];
			} else {
				left++;
			}
		}
		return left;
	}
}
