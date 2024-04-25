package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static com.xjdl.utils.DSAUtils.arrayForListNode;

@Slf4j
class LC160Test {
	@Test
	void getIntersectionNode() {
		int[] common = {1, 8, 4, 5};
		int[] arrA = {4, 7, 8};
		int[] arrB = {5, 0};

		ListNode<Integer> headCommon = arrayForListNode(common);

		ListNode<Integer> headA = arrayForListNode(arrA);
		headA.next = headCommon;

		ListNode<Integer> headB = arrayForListNode(arrB);
		headB.next = headCommon;

		log.debug("{}", LC160.getIntersectionNodeWithLength(headA, headB));
		log.debug("{}", LC160.getIntersectionNodeWithTwoPointers(headA, headB));
	}
}
