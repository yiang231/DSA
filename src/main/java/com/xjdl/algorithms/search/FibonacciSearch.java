package com.xjdl.algorithms.search;

import static com.xjdl.utils.DSAUtils.copyOf;
import static com.xjdl.utils.DSAUtils.getFibonacciArray;

/**
 * 斐波那契查找
 * 元素大小分布均匀
 * 二分查找/折半查找改进
 * 数组必须有序
 * 开始表中记录的个数最好比某个斐波那契数小1 顺序表长度n等于F[k]-1
 * 每次排除一半的查找范围，使用黄金分割点确定mid的位置
 */
public class FibonacciSearch {
	public static int find(int[] arr, int target) {
		// 查找的范围边界
		int min = 0;
		int max = arr.length - 1;
		// 斐波那契分割数值下标
		int k = 0;
		int mid;
		int[] fbncArr = getFibonacciArray(arr.length);
		// 获取斐波那契分割数值下标
		while (max > fbncArr[k] - 1) {
			k++;
		}
		int[] temp = copyOf(arr, fbncArr[k]);
		// 用数组最后的数填充temp
		for (int i = max + 1; i < temp.length; i++) {
			temp[i] = arr[max];
		}

		while (min <= max) {
			mid = min + fbncArr[k - 1] - 1;
			if (target < temp[mid]) {
				max = mid - 1;
				// 1.全部元素=前边元素+后边元素
				// 2.f[k] = f[k-1] + f[k-2]
				// 因为前面的 f[k-1] 个元素，所以我们可以继续拆分，f[k-1] = f[k-2] + f[k-3]
				// 即再f[k-1]的前面继续查找，k--
				k--;
			} else if (target > temp[mid]) {
				min = mid + 1;
				// 1.全部元素=前边元素+后边元素
				// 2.f[k] = f[k-1] + f[k-2]
				// 3.后面右 f[k-2] 个元素，继续拆分
				// 即下次循环 mid = f[k-1-2] - 1
				k -= 2;
			} else {
				return (mid <= max) ? mid : max;
			}
		}
		return -1;
	}
}
