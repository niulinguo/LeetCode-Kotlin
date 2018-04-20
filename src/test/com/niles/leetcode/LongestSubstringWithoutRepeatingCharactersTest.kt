package test.com.niles.leetcode

import main.com.niles.leetcode.LongestSubstringWithoutRepeatingCharacters
import kotlin.test.assertEquals

fun main(args: Array<String>) {
    val longestSubstringWithoutRepeatingCharacters = LongestSubstringWithoutRepeatingCharacters()
    test1(longestSubstringWithoutRepeatingCharacters)
}

fun test1(longestSubstringWithoutRepeatingCharacters: LongestSubstringWithoutRepeatingCharacters) {
    assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"), 3)
    assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"), 1)
    assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"), 3)
    assertEquals(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""), 0)
}