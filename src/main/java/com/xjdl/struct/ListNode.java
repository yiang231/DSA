package com.xjdl.struct;

/**
 * 一般单链表节点
 */
public class ListNode<E> extends Node<E> {
	public ListNode<E> next;

	public ListNode(E data) {
		super(data);
		this.next = null;
	}

	public ListNode(E data, ListNode<E> next) {
		super(data);
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		ListNode<E> current = this;
		while (current != null) {
			sb.append(current.getData()).append(", ");
			current = current.next;
		}
		if (sb.length() > 1) {
			sb.delete(sb.length() - 2, sb.length());
		}
		sb.append("]");
		return sb.toString();
	}
}
