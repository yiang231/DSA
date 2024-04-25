package com.xjdl.struct;

/**
 * 单向链表
 */
public class LinkedList<E> extends AbstractLinkedtList<E> {
	private ListNode<E> dummyHead;

	public LinkedList(int size, ListNode<E> dummyHead) {
		super(size);
		ListNode<E> dummyNode = new ListNode<>(null);
		dummyNode.next = dummyHead;
		this.dummyHead = dummyNode;
	}

	/**
	 * 初始化 SinglyLinkedList 对象
	 */
	public LinkedList() {
		super();
		this.dummyHead = new ListNode<>(null);
	}

	/**
	 * 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1
	 */
	@Override
	public E get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		ListNode<E> cur = dummyHead;
		for (int i = 0; i <= index; i++) {
			cur = cur.next;
		}
		return cur.getData();
	}

	/**
	 * 将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点
	 */
	@Override
	public void addAtHead(E val) {
		this.addAtIndex(0, val);
	}

	/**
	 * 将一个值为 val 的节点追加到链表中作为链表的最后一个元素
	 */
	@Override
	public void addAtTail(E val) {
		this.addAtIndex(size, val);
	}

	/**
	 * nodes -> 0 1 2 3 4 5
	 * <p>
	 * index ->   0 1 2 3 4
	 * <p>
	 * 将一个值为 val 的节点插入到链表中下标为 index 的节点之前。
	 * 如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。
	 * 如果 index 比长度更大，该节点将 不会插入 到链表中
	 */
	@Override
	public void addAtIndex(int index, E val) {
		if (index > size || index < 0) {
			return;
		}
		ListNode<E> pre = dummyHead;
		for (int i = 0; i < index; i++) {
			pre = pre.next;
		}
		ListNode<E> node = new ListNode<>(val);
		node.next = pre.next;
		pre.next = node;
		size++;
	}

	/**
	 * 如果下标有效，则删除链表中下标为 index 的节点
	 */
	@Override
	public E deleteAtIndex(int index) {
		if (index >= size || index < 0) {
			return null;
		}
		ListNode<E> pre = dummyHead;
		for (int i = 0; i < index; i++) {
			pre = pre.next;
		}
		E oldValue = pre.next.getData();
		pre.next = pre.next.next;
		size--;
		return oldValue;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		ListNode<E> current = dummyHead.next;
		while (current != null) {
			sb.append(current.getData());
			if (current.next != null) {
				sb.append(", ");
			}
			current = current.next;
		}
		sb.append("]");
		return sb.toString();
	}
}
