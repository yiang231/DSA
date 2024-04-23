package com.xjdl.algorithms.sort;

import java.util.Arrays;
import java.util.List;

public interface SortAlgorithm {
	<T extends Comparable<T>> T[] sort(T[] arr);

	@SuppressWarnings("unchecked")
	default <T extends Comparable<T>> List<T> sort(List<T> list) {
		return Arrays.stream(
				sort(list.toArray((T[]) new Comparable[list.size()]))
		).toList();
	}
}
