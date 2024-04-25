package com.xjdl.leetcode.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LC27Test {
	static Stream<Arguments> provider() {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		int target = 2;
		return Stream.of(
				Arguments.of(nums, target)
		);
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.leetcode.array.LC27Test#provider")
	void removeElement(int[] nums, int target) {
		int byLoop = LC27.removeElementByLoop(nums, target);
		int ByTwoPointersSameDirection = LC27.removeElementByTwoPointersSameDirection(nums, target);
		int ByTwoPointersOppositeDirection = LC27.removeElementByTwoPointersOppositeDirection(nums, target);
		int ByTwoPointersOppositeDirectionOptimized = LC27.removeElementByTwoPointersOppositeDirectionOptimized(nums, target);

		assertAll("LC27",
				() -> assertEquals(5, byLoop),
				() -> assertEquals(5, ByTwoPointersSameDirection),
				() -> assertEquals(5, ByTwoPointersOppositeDirection),
				() -> assertEquals(5, ByTwoPointersOppositeDirectionOptimized)
		);
	}
}
