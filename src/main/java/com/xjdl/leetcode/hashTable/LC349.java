package com.xjdl.leetcode.hashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 349. 两个数组的交集
 * <p>
 * <a href="https://leetcode.cn/problems/intersection-of-two-arrays/description/">intersection-of-two-arrays</a>
 */
public class LC349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        // 遍历数组1
        Arrays.stream(nums1).forEach(set1::add);
        // 遍历数组2的过程中判断哈希表中是否存在该元素
        Arrays.stream(nums2).forEach(item -> {
            if (set1.contains(item)) {
                resSet.add(item);
            }
        });
//        int[] arr = new int[resSet.size()];
//        int j = 0;
//        for(int i : resSet){
//            arr[j++] = i;
//        }
        return resSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
