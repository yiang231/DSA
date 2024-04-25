package com.xjdl.struct;

/**
 * 双向链表
 */
public class DoublyLinkedList<E> extends AbstractLinkedtList<E> {
	private DoublyListNode<E> dummyHead, dummyTail;

	public DoublyLinkedList() {
		super();
		this.dummyHead = new DoublyListNode<>(null);
		this.dummyTail = new DoublyListNode<>(null);
		this.dummyHead.next = dummyTail;
		this.dummyTail.prev = dummyHead;
	}

	@Override
	public E get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		DoublyListNode<E> cur;
		if (index < size >>> 1) {
			cur = dummyHead.next;
			for (int i = 0; i < index; i++) {
				cur = cur.next;
			}
		} else {
			cur = dummyTail.prev;
			for (int i = size - 1; i > index; i--) {
				cur = cur.prev;
			}
		}
		return cur.getData();
	}

	@Override
	public void addAtHead(E val) {
		DoublyListNode<E> node = new DoublyListNode<>(val);
		node.next = dummyHead.next;
		node.prev = dummyHead;
		dummyHead.next.prev = node;
		dummyHead.next = node;
		size++;
	}

	@Override
	public void addAtTail(E val) {
		DoublyListNode<E> node = new DoublyListNode<>(val);
		node.prev = dummyTail.prev;
		node.next = dummyTail;
		dummyTail.prev.next = node;
		dummyTail.prev = node;
		size++;
	}

	/**
	 * pred 代表“predecessor”（前驱）
	 * <p>
	 * succ 代表“successor”（后继）
	 */
	@Override
	public void addAtIndex(int index, E val) {
		if (index > size || index < 0) {
			return;
		}
		DoublyListNode<E> pred, succ;
		if (index < size >>> 1) {
			pred = dummyHead;
			for (int i = 0; i < index; i++) {
				pred = pred.next;
			}
			succ = pred.next;
		} else {
			succ = dummyTail;
			for (int i = size; i > index; i--) {
				succ = succ.prev;
			}
			pred = succ.prev;
		}

		// 插入节点
		DoublyListNode<E> node = new DoublyListNode<>(val);
		node.prev = pred;
		node.next = succ;
		pred.next = node;
		succ.prev = node;
		size++;
	}

	@Override
	public E deleteAtIndex(int index) {
		if (index >= size || index < 0) {
			return null;
		}
		DoublyListNode<E> pred, succ;
		E oldValue;
		if (index < size >>> 1) {
			pred = dummyHead;
			for (int i = 0; i < index; i++) {
				pred = pred.next;
			}
			oldValue = pred.next.getData();
			succ = pred.next.next;
		} else {
			succ = dummyTail;
			for (int i = size; i > index + 1; i--) {
				succ = succ.prev;
			}
			oldValue = succ.next.getData();
			pred = succ.prev.prev;
		}
		pred.next = succ;
		succ.prev = pred;
		size--;
		return oldValue;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		DoublyListNode<E> current = dummyHead.next;
		while (current != null && current.next != null) {
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
