package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Slf4j
class LC206Test {
	static Stream<Arguments> provider() {
		ListNode<Integer> node = null;
		for (int i = 5; i > 0; i--) {
			node = new ListNode<>(i, node);
		}
		log.debug("before  {}", node);
		return Stream.of(
				Arguments.of(node)
		);
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.leetcode.linkedList.LC206Test#provider")
	void reverseListIterative(ListNode<Integer> node) {
		log.debug("reverse {}", LC206.reverseListIterative(node));
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.leetcode.linkedList.LC206Test#provider")
	void reverseListRecursive(ListNode<Integer> node) {
		log.debug("reverse {}", LC206.reverseListRecursive(null, node));
	}

	@ParameterizedTest
	@MethodSource("com.xjdl.leetcode.linkedList.LC206Test#provider")
	void reverseListRecursiveFromEnd(ListNode<Integer> node) {
		log.debug("reverse {}", LC206.reverseListRecursiveFromEnd(node));
	}
}
