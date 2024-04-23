package com.xjdl.algorithms.sort;

/**
 * 选择排序
 */
public class SelectionSort {
	/**
	 * <a href="https://www.programiz.com/dsa/selection-sort">selection-sort</a>
	 */
	public static int[] sort(int[] array) {
		// 外循环遍历数组中的每个元素，从第一个元素开始到倒数第二个元素
		for (int step = 0; step < array.length - 1; step++) {
			// 假设当前位置的元素是最小的
			int min_idx = step;

			// 内循环从当前位置的下一个元素开始，找到剩余元素中最小的元素的索引
			for (int i = step + 1; i < array.length; i++) {
				// 如果找到比当前最小值还要小的元素，则更新最小值的索引
				if (array[i] < array[min_idx]) {
					min_idx = i;
				}
			}

			// 将当前位置的元素与剩余元素中最小元素进行交换
			int temp = array[step];
			array[step] = array[min_idx];
			array[min_idx] = temp;
		}
		// 返回排序后的数组
		return array;
	}
}
