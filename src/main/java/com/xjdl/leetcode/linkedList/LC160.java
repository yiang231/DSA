package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.ListNode;

/**
 * <a href="https://leetcode.cn/problems/intersection-of-two-linked-lists/description/">intersection-of-two-linked-lists</a>
 */
public class LC160 {
	public static <E> ListNode<E> getIntersectionNodeWithLength(ListNode<E> headA, ListNode<E> headB) {
		ListNode<E> curA = headA, curB = headB;
		int lenA = 0, lenB = 0, gap;

		while (curA != null) {
			lenA++;
			curA = curA.next;
		}
		curA = headA;

		while (curB != null) {
			lenB++;
			curB = curB.next;
		}
		curB = headB;

		if (lenB > lenA) {
			int lenTmp = lenA;
			lenA = lenB;
			lenB = lenTmp;

			ListNode<E> curTmp = curA;
			curA = curB;
			curB = curTmp;
		}

		gap = lenA - lenB;
		while (gap-- > 0) {
			curA = curA.next;
		}

		while (curA != null) {
			if (curA == curB) {
				return curA;
			}
			curA = curA.next;
			curB = curB.next;
		}
		return null;
	}

	public static <E> ListNode<E> getIntersectionNodeWithTwoPointers(ListNode<E> headA, ListNode<E> headB) {
		// p1 指向 A 链表头结点，p2 指向 B 链表头结点
		ListNode<E> p1 = headA, p2 = headB;
		while (p1 != p2) {
			// p1 走一步，如果走到 A 链表末尾，转到 B 链表
			if (p1 == null) {
				p1 = headB;
			} else {
				p1 = p1.next;
			}
			// p2 走一步，如果走到 B 链表末尾，转到 A 链表
			if (p2 == null) {
				p2 = headA;
			} else {
				p2 = p2.next;
			}
		}
		// 返回相交节点或 null
		return p1;
	}
}
