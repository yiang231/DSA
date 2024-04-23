package com.xjdl.algorithms.search;

/**
 * 插值查找
 * 元素大小分布均匀
 * 二分查找/折半查找改进
 * 数组必须有序
 * 每次排除一半的查找范围，mid靠近要查找的数据
 * 注意除数为零的问题
 */
public class InterpolationSearch {
	public static int findByIterative(int[] arr, int target, int low, int high) {
		while (low <= high && target >= arr[low] && target <= arr[high]) {
			// Java中，整数相除，结果为整数，舍去小数的部分
			// 计算出目标元素在查找范围的大致位置
			int mid = low
					+ (target - arr[low])
					/ (arr[high] - arr[low])
					* (high - low);

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

	public static int findByRecursive(int[] arr, int target, int low, int high) {
		if (low <= high) {
			int mid = low
					+ (target - arr[low])
					/ (arr[high] - arr[low])
					* (high - low);

			if (target == arr[mid]) {
				return mid;
			}
			if (arr[mid] < target) {
				return findByRecursive(arr, target, mid + 1, high);
			}
			return findByRecursive(arr, target, low, mid - 1);
		}
		return -1;
	}
}
