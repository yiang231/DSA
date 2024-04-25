package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Slf4j
class LC24Test {
	static Stream<Arguments> provider() {
		ListNode<Integer> node = null;
		for (int i = 9; i > 0; i--) {
			node = new ListNode<>(i, node);
		}
		log.debug("before  {}", node);
		return Stream.of(
				Arguments.of(node)
		);
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.leetcode.linkedList.LC24Test#provider")
	void swapNodesIterative(ListNode<Integer> node) {
		log.debug("swap {}", LC24.swapNodesIterative(node));
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.leetcode.linkedList.LC24Test#provider")
	void swapNodesRecursive(ListNode<Integer> node) {
		log.debug("swap {}", LC24.swapNodesRecursive(node));
	}
}
