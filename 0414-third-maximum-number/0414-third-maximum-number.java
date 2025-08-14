/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
import java.util.Arrays;
import java.util.List;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int res;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        if (list.size() < 3) {
            res = list.get(list.size() - 1);
        } else {
            res = list.get(list.size() - 3);
        }
        return  res;

    }
}
// @lc code=end

