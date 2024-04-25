package com.xjdl.leetcode.array;

/**
 * <a href="https://leetcode.cn/problems/spiral-matrix-ii/description/">spiral-matrix-ii</a>
 */
public class LC59 {
	public static int[][] generateMatrix(int n) {
		int loop = 0, start = 0, val = 1, x, y;
		int[][] point = new int[n][n];

		while (loop++ < n >>> 1) {
			// up => left to right
			for (y = start; y < n - loop; y++) {
				point[start][y] = val++;
			}
			// right => up to down
			for (x = start; x < n - loop; x++) {
				point[x][y] = val++;
			}
			// down => right to left
			for (; y >= loop; y--) {
				point[x][y] = val++;
			}
			// left => down to up
			for (; x >= loop; x--) {
				point[x][y] = val++;
			}
			start++;
		}
		// 如果n为奇数的话，需要单独给矩阵最中间的位置赋值
		if (n % 2 == 1) {
			point[start][start] = val;
		}

//		int m = (n % 2 == 1 ? loop : start) - 1;
//		if (log.isDebugEnabled()) {
//			log.debug("The largest number => {}[{}][{}]", point[start][m], start, m);
//		}

		return point;
	}
}
