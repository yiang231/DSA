package com.xjdl.utils;

import com.xjdl.struct.ListNode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DSAUtils {
	public static final String LEFT_SQUARE_BRACKET = "[";
	public static final String RIGHT_SQUARE_BRACKET = "]";
	public static final String COMMA = ", ";

	/**
	 * 获得斐波那契数列
	 */
	public static int[] getFibonacciArray(int len) {
		// 46
		int[] fbnc = new int[len];
		fbnc[0] = 1;
		fbnc[1] = 1;
		for (int i = 2; i < fbnc.length; i++) {
			fbnc[i] = fbnc[i - 1] + fbnc[i - 2];
		}
		return fbnc;
	}

	public static int[] copyOf(int[] src, int newLength) {
		if (src.length == newLength) {
			return src;
		}
		int[] dest = new int[newLength];
		int length = src.length <= newLength ? src.length : newLength;
		arraycopy(src, 0, dest, 0, length);
		return dest;
	}

	public static int[] arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
		if (src.length == 0 || dest.length == 0) {
			throw new NullPointerException("array is null");
		}
		if (srcPos < 0 || destPos < 0 || length < 0 || src.length < srcPos + length || dest.length < destPos + length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		while (length-- > 0) {
			dest[destPos++] = src[srcPos++];
		}
		return dest;
	}

	public static List<Integer> getSedgewickSequence(int length) {
		// 创建一个空的增量序列列表
		List<Integer> sequence = new ArrayList<>();
		// 将初始增量1添加到序列中
		sequence.add(1);
		// 初始化增量序列的指数
		int k = 1;
		// 不断计算增量序列中的下一个步长，直到超过或等于数组长度
		while (true) {
			// 使用 Sedgewick 的递推公式计算当前步长
			int step = (int) (Math.pow(4, k) + 3 * Math.pow(2, k - 1) + 1);
			// 如果当前步长超过或等于数组长度，停止生成增量序列
			if (step >= length) {
				break;
			}
			// 将当前步长加入增量序列
			sequence.add(step);
			// 更新指数，生成下一个步长
			k++;
		}
		// 返回生成的增量序列
		return sequence;
	}

	public static List<Integer> getHibbardSequence(int length) {
		// 创建一个空的增量序列列表
		List<Integer> sequence = new ArrayList<>();
		// 初始化增量序列的指数
		int k = 1;
		// 不断计算增量序列中的下一个步长，直到超过或等于数组长度
		while (true) {
			// 使用 Hibbard 的递推公式计算当前步长
			int step = (int) (Math.pow(2, k) - 1);
			// 如果当前步长超过或等于数组长度，停止生成增量序列
			if (step >= length) {
				break;
			}
			// 将当前步长加入增量序列
			sequence.add(step);
			// 更新指数，生成下一个步长
			k++;
		}
		// 返回生成的增量序列
		return sequence;
	}

	public static void printArray(int[] nums) {
		printArray(nums, 0, nums.length - 1, false);
	}

	public static void printArray(int[] nums, int l, int r) {
		printArray(nums, l, r, false);
	}

	public static void printArray(int[] nums, int l, int r, boolean index) {
		if (log.isDebugEnabled()) {
			StringBuilder sb = new StringBuilder(LEFT_SQUARE_BRACKET);
			for (int i = l; i <= r; i++) {
				sb.append(nums[i]);
				if (index) {
					sb.append(LEFT_SQUARE_BRACKET).append(i).append(RIGHT_SQUARE_BRACKET);
				}
				if (i != r) {
					sb.append(COMMA);
				}
			}
			sb.append(RIGHT_SQUARE_BRACKET);
			log.debug("{}", sb);
		}
	}

	public static void print2DArrayByIterative(int[][] target) {
		if (log.isDebugEnabled()) {
			for (int[] row : target) {
				log.debug("{}", row);
			}
		}
	}

	public static void print2DArray(int[][] target) {
		print2DArray(target, true);
	}

	public static void print2DArray(int[][] target, boolean index) {
		if (log.isDebugEnabled()) {
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < target.length; x++) {
				sb.append(LEFT_SQUARE_BRACKET);
				for (int y = 0; y < target[x].length; y++) {
					sb.append(target[x][y]);
					if (index) {
						sb.append(LEFT_SQUARE_BRACKET).append(x).append("][")
								.append(y).append(RIGHT_SQUARE_BRACKET);
					}
					if (y < target[x].length - 1) {
						sb.append(COMMA);
					}
				}
				sb.append(RIGHT_SQUARE_BRACKET);
				log.debug("{}", sb);
				sb.setLength(0);
			}
		}
	}

	public static ListNode<Integer> arrayForListNode(int[] arr) {
		ListNode<Integer> listNode = null;
		for (int i = arr.length - 1; i >= 0; i--) {
			listNode = new ListNode<>(arr[i], listNode);
		}
		return listNode;
	}

	public static <E> ListNode<E> getLastListNode(ListNode<E> listNode) {
		if (listNode == null) {
			return null;
		}
		while (listNode.next != null) {
			listNode = listNode.next;
		}
		return listNode;
	}
}
