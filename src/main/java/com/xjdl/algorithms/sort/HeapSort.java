package com.xjdl.algorithms.sort;

/**
 * 堆排序
 */
public class HeapSort {
	/**
	 * <a href="https://www.programiz.com/dsa/heap-sort">heap-sort</a>
	 */
	public static int[] sort(int[] arr) {
		int n = arr.length;

		// 构建最大堆
		for (int i = (n >> 1) - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// 逐步将最大元素移动到数组末尾，然后重新调整堆
		for (int i = n - 1; i >= 0; i--) {
			// 将根节点（当前堆中最大元素）与最后一个元素交换
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// 重新调整堆，将堆顶元素下沉到合适的位置
			heapify(arr, i, 0);
		}
		// 返回排序后的数组
		return arr;
	}

	/**
	 * 调整堆的函数，确保以给定节点为根的子树满足最大堆的性质
	 */
	private static void heapify(int[] arr, int n, int i) {
		// 假设当前节点是最大值
		int largest = i;
		// 计算左右子节点的索引
		int l = (i << 1) + 1;
		int r = (i << 1) + 2;

		// 如果左子节点存在且比当前节点大，则更新最大值索引
		if (l < n && arr[l] > arr[largest]) {
			largest = l;
		}

		// 如果右子节点存在且比当前节点大，则更新最大值索引
		if (r < n && arr[r] > arr[largest]) {
			largest = r;
		}

		// 如果最大值索引不是当前节点，则交换当前节点与最大值节点，并递归调整子树
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);
		}
	}
}
