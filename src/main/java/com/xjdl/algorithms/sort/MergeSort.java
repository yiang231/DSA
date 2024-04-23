package com.xjdl.algorithms.sort;

/**
 * 归并排序
 */
public class MergeSort {
	public static int[] sortByIterative(int[] array, int l, int h) {
		// 如果左右边界相等，说明数组中只有一个元素，无需排序，直接返回包含该元素的数组
		if (l == h) {
			return new int[]{array[l]};
		}

		// 计算中间索引
		int mid = l + ((h - l) >> 1);

		// 递归地对左右两个子数组进行排序
		// 左有序数组
		int[] leftArr = sortByIterative(array, l, mid);
		// 右有序数组
		int[] rightArr = sortByIterative(array, mid + 1, h);

		// 创建一个新的数组来存储合并后的有序数组
		int[] newNum = new int[leftArr.length + rightArr.length];

		// 合并左右两个有序数组
		int m = 0, i = 0, j = 0;
		while (i < leftArr.length && j < rightArr.length) {
			// 比较左右两个数组的元素，将较小的元素放入新数组中
			newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
		}
		// 处理左数组中剩余的元素
		while (i < leftArr.length) {
			newNum[m++] = leftArr[i++];
		}
		// 处理右数组中剩余的元素
		while (j < rightArr.length) {
			newNum[m++] = rightArr[j++];
		}
		// 返回合并后的有序数组
		return newNum;
	}

	/**
	 * <a href="https://www.programiz.com/dsa/merge-sort">merge-sort</a>
	 */
	public static int[] sortByRecursive(int[] array, int l, int r) {
		// 如果左边界小于右边界，说明数组还可以继续划分
		if (l < r) {
			// 计算中间索引
			int m = (l + r) >> 1;

			// 分别对左右两个子数组进行排序
			sortByRecursive(array, l, m);
			sortByRecursive(array, m + 1, r);

			// 合并两个有序子数组
			merge(array, l, m, r);
		}
		// 返回排序后的数组
		return array;
	}

	/**
	 * 合并两个有序子数组
	 */
	private static void merge(int[] arr, int p, int q, int r) {
		// 计算左右两个子数组的长度
		int n1 = q - p + 1;
		int n2 = r - q;

		// 创建临时数组来存储左右两个子数组
		int[] L = new int[n1];
		int[] M = new int[n2];

		// 将数据复制到临时数组中
		for (int i = 0; i < n1; i++) {
			L[i] = arr[p + i];
		}
		for (int j = 0; j < n2; j++) {
			M[j] = arr[q + 1 + j];
		}

		// 合并左右两个子数组
		int i = 0, j = 0, k = p;
		while (i < n1 && j < n2) {
			if (L[i] <= M[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = M[j];
				j++;
			}
			k++;
		}

		// 将剩余元素复制到数组中
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = M[j];
			j++;
			k++;
		}
	}
}
