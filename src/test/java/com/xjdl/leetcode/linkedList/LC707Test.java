package com.xjdl.leetcode.linkedList;

import com.xjdl.struct.DoublyLinkedList;
import com.xjdl.struct.LinkedList;
import com.xjdl.struct.List;
import com.xjdl.struct.ListNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * <a href="https://leetcode.cn/problems/design-linked-list/description/">design-linked-list</a>
 */
@Slf4j
class LC707Test {
	/**
	 * design-linked-list
	 */
	@Test
	void mySinglyLinkedList() {
		ListNode<Integer> node = null;
		for (int i = 5; i > 0; i--) {
			node = new ListNode<>(i, node);
		}
		List<Integer> singlyLinkedList = new LinkedList<>(5, node);

		singlyLinkedList.addAtHead(99);
		singlyLinkedList.addAtTail(99);
		singlyLinkedList.addAtIndex(3, 100);
		log.debug("SinglyLinkedList before {}", singlyLinkedList.get(3));
		log.debug("singlyLinkedList.deleteAtIndex(3) {}", singlyLinkedList.deleteAtIndex(3));
		log.debug("SinglyLinkedList after  {}", singlyLinkedList.get(3));
		log.debug("{}", singlyLinkedList);
	}

	/**
	 * design-doubly-linked-list
	 */
	@Test
	void myDoublyLinkedList() {
		List<Integer> doublyLinkedList = new DoublyLinkedList<>();
		for (int i = 5; i > 0; i--) {
			doublyLinkedList.addAtHead(i);
		}

		doublyLinkedList.addAtHead(99);
		doublyLinkedList.addAtTail(99);
		doublyLinkedList.addAtIndex(3, 100);
		log.debug("DoublyLinkedList before {}", doublyLinkedList.get(3));
		log.debug("doublyLinkedList.deleteAtIndex(3) {}", doublyLinkedList.deleteAtIndex(3));
		log.debug("DoublyLinkedList after  {}", doublyLinkedList.get(3));
		log.debug("{}", doublyLinkedList);
	}
}
