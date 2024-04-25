package com.xjdl.struct;

public interface List<E> {
	int size();

	E get(int index);

	void addAtHead(E val);

	void addAtTail(E val);

	void addAtIndex(int index, E val);

	E deleteAtIndex(int index);
}
