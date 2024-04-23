package com.xjdl.algorithms.sort;

/**
 * 插入排序
 */
public class InsertionSort {
	/**
	 * <a href="https://www.programiz.com/dsa/insertion-sort">insertion-sort</a>
	 */
	public static int[] sort(int[] array) {
		// 外部循环，从数组的第二个元素开始遍历到最后一个元素
		for (int step = 1; step < array.length; step++) {
			// 保存当前要插入的元素
			int key = array[step];
			// 初始化内部循环的索引为当前元素的前一个位置
			int j = step - 1;

			// 内部循环，向前遍历已经排好序的子数组，找到当前元素应该插入的位置
			// 同时将大于当前元素的元素向后移动一位
			while (j >= 0 && key < array[j]) {
				// 将大于当前元素的元素向后移动一位
				array[j + 1] = array[j];
				// 向前移动索引，继续比较
				--j;
			}

			// 当内部循环结束时，j+1处即为当前元素应该插入的位置
			// 将当前元素插入到正确的位置
			array[j + 1] = key;
		}

		// 返回排序后的数组
		return array;
	}
}
