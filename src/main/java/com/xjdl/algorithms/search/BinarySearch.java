package com.xjdl.algorithms.search;

/**
 * 二分查找/折半查找
 * 数组必须有序
 * 每次排除一半的查找范围，mid指向中间数据
 */
public class BinarySearch {
	/**
	 * <a href="https://www.programiz.com/dsa/binary-search">Iterative Method</a>
	 */
	public static int findByIterative(int[] arr, int target, int low, int high) {
		while (low <= high) {
			int mid = (low + high) >>> 1;

			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	/**
	 * <a href="https://www.programiz.com/dsa/binary-search">Recursive Method</a>
	 */
	public static int findByRecursive(int[] arr, int target, int low, int high) {
		if (low <= high) {
			int mid = (low + high) >>> 1;

			if (target == arr[mid]) {
				return mid;
			}
			if (target < arr[mid]) {
				return findByRecursive(arr, target, low, mid - 1);
			}
			return findByRecursive(arr, target, mid + 1, high);
		}
		return -1;
	}
}
