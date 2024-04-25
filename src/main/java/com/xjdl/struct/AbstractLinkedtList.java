package com.xjdl.struct;

public abstract class AbstractLinkedtList<E> implements List<E> {
	public int size;

	public AbstractLinkedtList() {
		this.size = 0;
	}

	public AbstractLinkedtList(int size) {
		this.size = size;
	}

	@Override
	public int size() {
		return this.size;
	}

	public abstract E get(int index);

	public abstract void addAtIndex(int index, E val);

	public abstract E deleteAtIndex(int index);
}

