package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Slf4j
class LC203Test {

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
	@MethodSource("com.xjdl.leetcode.linkedList.LC203Test#provider")
	void removeElements(ListNode<Integer> node) {
		log.debug("removed {}", LC203.remove(node, 3));
		log.debug("removed {}", LC203.removeWithDummy(node, 3));
		log.debug("removed {}", LC203.removeWithoutDummy(node, 3));
	}
}
