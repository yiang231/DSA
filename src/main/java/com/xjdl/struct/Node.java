package com.xjdl.struct;

public abstract class Node<E> {
	private E data;

	public Node(E data) {
		this.data = data;
	}

	public E getData() {
		return data;
	}
}
