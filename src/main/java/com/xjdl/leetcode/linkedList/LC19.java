package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;

/**
 * <a href="https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/">remove-nth-node-from-end-of-list</a>
 */
public class LC19 {
	public static <E> ListNode<E> removeNthFromEnd(ListNode<E> head, int n) {
		ListNode<E> dummyNode = new ListNode<>(null);
		dummyNode.next = head;

		ListNode<E> fp = dummyNode, sp = dummyNode;

		for (int i = 0; i < n; i++) {
			fp = fp.next;
		}

		while (fp != null) {
			fp = fp.next;
			sp = sp.next;
		}

		sp.next = sp.next.next;
		return dummyNode.next;
	}
}
