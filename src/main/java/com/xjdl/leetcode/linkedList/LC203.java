package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;

/**
 * <a href="https://leetcode.cn/problems/remove-linked-list-elements/description/">remove-linked-list-elements</a>
 */
public class LC203 {
	public static <E> ListNode<E> removeWithDummy(ListNode<E> head, E val) {
		if (head == null) {
			return head;
		}

		ListNode<E> dummy = new ListNode<>(null, head), pre = dummy, cur = head;

		while (cur != null) {
			if (cur.getData() == val) {
				pre.next = cur.next;
			} else {
				pre = cur;
			}
			cur = cur.next;
		}
		return dummy.next;
	}

	public static <E> ListNode<E> removeWithoutDummy(ListNode<E> head, E val) {
		while (head != null && head.getData() == val) {
			head = head.next;
		}

		if (head == null) {
			return head;
		}

		ListNode<E> pre = head, cur = head.next;

		while (cur != null) {
			if (cur.getData() == val) {
				pre.next = cur.next;
			} else {
				pre = cur;
			}
			cur = cur.next;
		}
		return head;
	}

	public static <E> ListNode<E> remove(ListNode<E> head, E val) {
		while (head != null && head.getData() == val) {
			head = head.next;
		}

		ListNode<E> cur = head;

		while (cur != null) {
			while (cur.next != null && cur.next.getData() == val) {
				cur.next = cur.next.next;
			}
			cur = cur.next;
		}
		return head;
	}
}
