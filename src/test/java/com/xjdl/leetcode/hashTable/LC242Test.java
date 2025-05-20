package com.xjdl.leetcode.hashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LC242Test {
    @Test
    void isAnagram() {
        assertAll("LC242",
                () -> assertTrue(LC242.isAnagram("anagram", "nagaram")),
                () -> assertFalse(LC242.isAnagram("rat", "car")),
                () -> assertTrue(LC242.isAnagram("kfc", "fck"))
        );
    }
}