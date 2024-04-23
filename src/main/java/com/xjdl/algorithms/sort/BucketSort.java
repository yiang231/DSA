package com.xjdl.algorithms.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 桶排序
 */
public class BucketSort {
	/**
	 * <a href="https://www.programiz.com/dsa/bucket-sort">bucket-sort</a>
	 */
	public static float[] sort(float[] arr, int n) {
		// 如果数组长度小于等于0，直接返回数组
		if (n <= 0) {
			return arr;
		}
		// 创建一个桶数组，用于存放元素
		@SuppressWarnings("unchecked")
		ArrayList<Float>[] bucket = new ArrayList[n];

		// 初始化桶数组，每个桶都是一个ArrayList
		for (int i = 0; i < n; i++) {
			bucket[i] = new ArrayList<>();
		}

		// 将元素分配到对应的桶中
		for (int i = 0; i < n; i++) {
			int bucketIndex = (int) (arr[i] * n);
			bucket[bucketIndex].add(arr[i]);
		}

		// 对每个桶中的元素进行排序
		for (int i = 0; i < n; i++) {
			Collections.sort((bucket[i]));
		}

		// 将排序后的元素依次放回原数组
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0, size = bucket[i].size(); j < size; j++) {
				arr[index++] = bucket[i].get(j);
			}
		}
		// 返回排序后的数组
		return arr;
	}
}
