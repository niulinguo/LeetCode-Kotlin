package main.com.niles.leetcode

/**
 * 题目
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var count = 0
        var first = 0
        var second = 0
        val hashSet: HashSet<Char> = HashSet()
        while (second < s.length) {
            while (first < second && hashSet.contains(s[second])) {
                hashSet.remove(s[first++])
            }
            while (second < s.length && !hashSet.contains(s[second])) {
                hashSet.add(s[second++])
            }
            count = maxOf(count, second - first)
        }
        return count
    }
}