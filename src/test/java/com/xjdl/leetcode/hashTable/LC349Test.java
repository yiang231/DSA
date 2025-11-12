package com.xjdl.leetcode.hashTable;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Slf4j
class LC349Test {
    static Stream<Arguments> provider() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        return Stream.of(
                Arguments.of(nums1, nums2)
        );
    }

    @ParameterizedTest
    @MethodSource("com.xjdl.leetcode.hashTable.LC349Test#provider")
    void intersection(int[] nums1, int[] nums2) {
        log.info("{}", LC349.intersection(nums1, nums2));
    }
}