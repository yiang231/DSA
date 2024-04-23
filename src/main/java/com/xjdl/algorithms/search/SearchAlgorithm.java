package com.xjdl.algorithms.search;

public interface SearchAlgorithm {
	<T extends Comparable<T>> int find(T[] arr, T key);

	default <T extends Comparable<T>> int[] find(T[][] matrix, T key) {
		return new int[]{-1, -1};
	}
}
