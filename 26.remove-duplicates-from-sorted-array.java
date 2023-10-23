/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) { // fast has encountered a new number.
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;

    }
}
// @lc code=end

