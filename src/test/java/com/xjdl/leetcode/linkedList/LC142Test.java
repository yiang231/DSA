package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static com.xjdl.utils.DSAUtils.arrayForListNode;
import static com.xjdl.utils.DSAUtils.getLastListNode;

@Slf4j
class LC142Test {
	@Test
	void detectCycle() {
		int[] arrX = {4, 6, 8};
		int[] arrY = {1, 2, 3, 4, 5};
		int[] arrZ = {9, 0};

		ListNode<Integer> x = arrayForListNode(arrX);
		ListNode<Integer> y = arrayForListNode(arrY);
		ListNode<Integer> z = arrayForListNode(arrZ);

		ListNode<Integer> dummy = new ListNode<>(-1);
		dummy.next = y;
		ListNode<Integer> curY = dummy;
		curY = getLastListNode(curY);
		curY.next = z;

		x = getLastListNode(x);
		x.next = dummy;
		// 环形链表禁止 Debug
		// 打印节点的值而不是节点本身
		z = getLastListNode(z);
		z.next = dummy;

		ListNode<Integer> cycle = LC142.detectCycle(x);
		int count = 3;
		while (count > 0 && cycle != null) {
			int val = cycle.getData();
			if (val == -1) count--;
			log.debug("{}", val);
			cycle = cycle.next;
		}
	}
}
