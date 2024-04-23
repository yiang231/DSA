package com.xjdl.algorithms.search;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
	public static int find(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int[] findAll(int[] arr, int key) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				result.add(i);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
