package com.xjdl.algorithms.sort;

/**
 * 计数排序
 */
public class CountingSort {
	/**
	 * <a href="https://www.programiz.com/dsa/counting-sort">counting-sort</a>
	 */
	public static int[] sort(int[] array, int size) {
		// 创建一个输出数组，长度为输入数组的长度加1，用于存储排序后的结果
		int[] output = new int[size + 1];

		// 找到数组中的最大值，以确定计数数组的长度
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		// 创建计数数组，长度为最大值加1，用于存储每个元素的出现次数
		int[] count = new int[max + 1];

		// 初始化计数数组，将所有元素的计数置为0
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}

		// 统计每个元素出现的次数，并存储到计数数组中
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}

		// 对计数数组进行累加，以便确定每个元素在输出数组中的位置
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}

		// 根据计数数组中的信息，将元素放置到输出数组中的正确位置
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}

		// 将排序后的结果复制回原数组
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
		}

		// 返回排序后的数组
		return array;
	}
}
