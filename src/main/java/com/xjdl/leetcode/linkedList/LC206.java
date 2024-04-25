package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;

/**
 * <a href="https://leetcode.cn/problems/reverse-linked-list/description/">reverse-linked-list</a>
 */
public class LC206 {
	public static <E> ListNode<E> reverseListIterative(ListNode<E> node) {
		ListNode<E> pre = null, cur = node, temp;

		while (cur != null) {
			temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return pre;
	}

	public static <E> ListNode<E> reverseListRecursive(ListNode<E> pre, ListNode<E> cur) {
		if (cur == null) {
			return pre;
		}
		ListNode<E> temp = cur.next;
		cur.next = pre;
		return reverseListRecursive(cur, temp);
	}

	/**
	 * 从后往前翻转指针指向
	 */
	public static <E> ListNode<E> reverseListRecursiveFromEnd(ListNode<E> node) {
		if (node == null) {
			return null;
		}
		if (node.next == null) {
			return node;
		}
		ListNode<E> last = reverseListRecursiveFromEnd(node.next);
		node.next.next = node;
		node.next = null;
		return last;
	}
}
