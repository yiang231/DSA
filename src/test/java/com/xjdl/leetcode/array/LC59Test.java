package com.xjdl.leetcode.array;

import com.xjdl.utils.DSAUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class LC59Test {
	@Test
	void generateMatrix() {
		int[][] result = LC59.generateMatrix(12);

		max(result);
		DSAUtils.print2DArray(result);
	}

	private void max(int[][] target) {
		int nx = target.length >>> 1, ny = nx;

		if (target.length % 2 != 1) {
			ny -= 1;
		}

		log.debug("The largest number => {}[{}][{}]", target[nx][ny], nx, ny);
	}
}
