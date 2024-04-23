package com.xjdl.algorithms.sort;

import com.xjdl.utils.DSAUtils;

import java.util.List;

/**
 * 希尔排序
 */
public class ShellSort {

	public static int[] sort(int[] arr) {
		// 使用希尔增量序列，从数组长度的一半开始，逐渐减小步长
		for (int step = arr.length >> 1; step >= 1; step /= 2) {
			// 对每个步长进行插入排序
			for (int i = step; i < arr.length; i++) {
				// 将当前元素暂存于临时变量
				int temp = arr[i];
				// 在当前元素之前的步长内进行插入排序
				int j = i - step;
				while (j >= 0 && arr[j] > temp) {
					// 如果当前元素比临时变量大，则后移当前元素
					arr[j + step] = arr[j];
					// 向前移动步长
					j -= step;
				}
				// 将临时变量插入到合适的位置
				arr[j + step] = temp;
			}
		}
		// 返回排序后的数组
		return arr;
	}

	/**
	 * 使用 Sedgewick 增量序列来对数组进行希尔排序
	 */
	public static int[] sortByOptimalIncrementsSequence(int[] arr) {
		// 获取 Sedgewick 增量序列
		List<Integer> sequence = DSAUtils.getSedgewickSequence(arr.length);
		// 逆序遍历增量序列
		for (int stepIndex = sequence.size() - 1; stepIndex >= 0; stepIndex--) {
			int step = sequence.get(stepIndex);
			// 使用当前步长对数组进行希尔排序
			for (int i = step; i < arr.length; i++) {
				int temp = arr[i];
				int j = i;
				while (j >= step && arr[j - step] > temp) {
					arr[j] = arr[j - step];
					j -= step;
				}
				arr[j] = temp;
			}
		}
		// 返回排序后的数组
		return arr;
	}
}
