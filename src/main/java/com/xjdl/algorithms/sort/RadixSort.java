package com.xjdl.algorithms.sort;

/**
 * 基数排序
 */
public class RadixSort {
	/**
	 * <a href="https://www.programiz.com/dsa/radix-sort">radix-sort</a>
	 */
	public static int[] sort(int[] array, int size) {
		// 获取数组中的最大值
		int max = getMax(array, size);

		// 对每一位进行计数排序，从个位到最高位
		for (int place = 1; max / place > 0; place *= 10) {
			countingSort(array, size, place);
		}
		// 返回排序后的数组
		return array;
	}

	private static int getMax(int[] array, int n) {
		int max = array[0];
		for (int i = 1; i < n; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * 计数排序，根据指定位数进行排序
	 */
	private static void countingSort(int[] array, int size, int place) {
		// 创建一个输出数组，长度为原数组长度加1
		int[] output = new int[size + 1];
		// 获取当前位数上的最大值
		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}
		// 创建计数数组，长度为当前位数上的最大值加1
		int[] count = new int[max + 1];

		// 初始化计数数组，将所有元素的计数置为0
		for (int i = 0; i < max; ++i)
			count[i] = 0;

		// 统计每个元素出现的次数，并存储到计数数组中
		for (int i = 0; i < size; i++)
			count[(array[i] / place) % 10]++;

		// 对计数数组进行累加，以便确定每个元素在输出数组中的位置
		for (int i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// 根据当前位数上的数字，将元素放置到输出数组中的正确位置
		for (int i = size - 1; i >= 0; i--) {
			output[count[(array[i] / place) % 10] - 1] = array[i];
			count[(array[i] / place) % 10]--;
		}

		// 将排序后的结果复制回原数组
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
		}
	}
}
