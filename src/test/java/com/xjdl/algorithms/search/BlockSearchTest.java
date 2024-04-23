package com.xjdl.algorithms.search;

import com.xjdl.struct.Block;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlockSearchTest {
	@Test
	void find() {
		int[] arr = {27, 22, 30, 40, 36
				, 13, 19, 16, 20
				, 7, 10
				, 43, 50, 48};

		Block blockPlus1 = new Block(22, 40, 0, 4);
		Block blockPlus2 = new Block(13, 20, 5, 8);
		Block blockPlus3 = new Block(7, 10, 9, 10);
		Block blockPlus4 = new Block(43, 50, 11, 13);

		Block[] blockPlusArr = {blockPlus1, blockPlus2, blockPlus3, blockPlus4};

		int result = BlockSearch.find(blockPlusArr, arr, 27);

		assertEquals(0, result);
	}
}
