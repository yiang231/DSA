package com.xjdl.struct;

/**
 * 一般双链表节点
 */
public class DoublyListNode<E> extends Node<E> {
	public DoublyListNode<E> prev, next;

	public DoublyListNode(E data) {
		super(data);
		this.prev = null;
		this.next = null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DoublyListNode<E> current = this;
		sb.append("[").append(current.getData());
		while (current.next != null) {
			current = current.next;
			sb.append(", ").append(current.getData());
		}
		sb.append("]");
		return sb.toString();
	}
}
