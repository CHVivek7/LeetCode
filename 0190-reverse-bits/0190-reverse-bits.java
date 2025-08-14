/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder s = new StringBuilder();
        s.append(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        s.reverse();
        return Integer.parseUnsignedInt(s.toString(), 2);
    }
}
// @lc code=end