package com.xjdl.leetcode.hashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * 202.快乐数
 * <p>
 * <a href="https://leetcode.cn/problems/intersection-of-two-arrays/description/">intersection-of-two-arrays</a>
 */
public class LC202 {
    public static boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    private static int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
