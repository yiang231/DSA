package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;

/**
 * <a href="https://leetcode.cn/problems/swap-nodes-in-pairs/description/">swap-nodes-in-pairs</a>
 */
public class LC24 {
	public static <E> ListNode<E> swapNodesRecursive(ListNode<E> head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode<E> next = head.next;
		ListNode<E> node = swapNodesRecursive(next.next);
		next.next = head;
		head.next = node;
		return next;
	}

	public static <E> ListNode<E> swapNodesIterative(ListNode<E> head) {
		ListNode<E> dummyHead = new ListNode<>(null);
		dummyHead.next = head;

		ListNode<E> cur = dummyHead;
		ListNode<E> tail, node1, node2;

		while (cur.next != null && cur.next.next != null) {
			tail = cur.next.next.next;
			node1 = cur.next;
			node2 = cur.next.next;
			// dummy -> 2 -> 1 -> tail
			cur.next = node2;
			node2.next = node1;
			node1.next = tail;
			cur = node1;
		}
		return dummyHead.next;
	}
}
