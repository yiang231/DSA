package com.xjdl.algorithms.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
	/**
	 * <a href="https://www.programiz.com/dsa/bubble-sort">bubble-sort</a>
	 */
	public static int[] sort(int[] array) {
		// 外循环控制每次比较的轮数，每一轮都会将当前未排序部分的最大元素移动到正确的位置
		for (int i = 0; i < (array.length - 1); i++) {
			// swapped标志用于检测在一轮比较中是否发生了元素交换
			boolean swapped = false;

			// 内循环遍历未排序的部分，并执行相邻元素的比较和交换
			for (int j = 0; j < (array.length - i - 1); j++) {
				// 如果相邻的两个元素顺序错误，则交换它们
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					// 设置交换标志为true
					swapped = true;
				}
			}

			// 如果在本轮比较中没有发生元素交换，说明数组已经有序，可以提前结束排序
			if (!swapped)
				break;
		}
		// 返回排序后的数组
		return array;
	}
}
