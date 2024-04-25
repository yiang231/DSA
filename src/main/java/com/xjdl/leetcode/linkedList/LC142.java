package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;

/**
 * <a href="https://leetcode.cn/problems/linked-list-cycle-ii/description/">linked-list-cycle-ii</a>
 */
public class LC142 {
	/**
	 * x = (n - 1) (y + z) + z
	 * <p>
	 * x -> 环入口前的节点数量
	 * n -> 两个指针相遇时，快指针走的圈数
	 * y -> 环入口到相遇节点的之间的节点数量
	 * z -> 相遇节点到环入口的之间的节点数量
	 */
	public static <E> ListNode<E> detectCycle(ListNode<E> head) {
		ListNode<E> fp = head;
		ListNode<E> sp = head;

		while (fp != null && fp.next != null) {
			fp = fp.next.next;
			sp = sp.next;

			if (fp == sp) {
				ListNode<E> meet = fp;
				ListNode<E> start = head;
				while (meet != start) {
					meet = meet.next;
					start = start.next;
				}
				return meet;
			}
		}
		return null;
	}
}
