package com.xjdl.algorithms.search;

import com.xjdl.struct.Block;

/**
 * 分块查找
 * 块的数量为元素数量的根号
 * 先找块，再找块内元素
 */
public class BlockSearch {
	/**
	 * 数据分块，块与块之间没有数据交集
	 */
	public static int find(Block[] blockPlusArr, int[] arr, int target) {
		int maybeBlockIndex = -1;
		for (int i = 0; i < blockPlusArr.length; i++) {
			if (blockPlusArr[i].getMin() <= target && target <= blockPlusArr[i].getMax()) {
				maybeBlockIndex = i;
				break;
			}
		}
		if (maybeBlockIndex == -1) {
			return -1;
		}
		Block blockPlus = blockPlusArr[maybeBlockIndex];
		for (int i = blockPlus.getStartIndex(); i <= blockPlus.getEndIndex(); i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
