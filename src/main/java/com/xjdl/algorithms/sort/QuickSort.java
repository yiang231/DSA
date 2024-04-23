package com.xjdl.algorithms.sort;

/**
 * 快速排序
 */
public class QuickSort {
	/**
	 * <a href="https://www.programiz.com/dsa/quick-sort">quick-sort</a>
	 */
	public static int[] sort(int[] array, int low, int high) {
		// 如果左边界小于右边界，说明数组还可以继续划分
		if (low < high) {
			// 对数组进行分区，获取分区点的索引
			int pi = partition(array, low, high);
			// 对分区点左边的子数组进行排序
			sort(array, low, pi - 1);
			// 对分区点右边的子数组进行排序
			sort(array, pi + 1, high);
		}
		// 返回排序后的数组
		return array;
	}

	/**
	 * 分区函数，用于确定分区点的位置
	 */
	private static int partition(int[] array, int low, int high) {
		// 选择数组的最后一个元素作为枢纽元素
		int pivot = array[high];
		// 初始化分区点的索引
		int i = (low - 1);

		// 遍历数组，将小于等于枢纽元素的元素移到分区点的左侧
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;

				// 将当前元素与分区点的下一个位置交换
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// 将枢纽元素放置到分区点的位置上
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		// 返回分区点的索引
		return (i + 1);
	}
}
