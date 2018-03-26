package Algorithm.leetcode;
/*
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

        Example:

        Given nums = [-2, 0, 3, -5, 2, -1]

        sumRange(0, 2) -> 1
        sumRange(2, 5) -> -1
        sumRange(0, 5) -> -3

        Note:

        You may assume that the array does not change.
        There are many calls to sumRange function.

*/

public class _303 {
    int[] input;

    public _303(int[] nums) {
        input = new int[nums.length];
        if (nums.length != 0) {
            input[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                input[i] = input[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) return input[j];
        return input[j] - input[i - 1];

    }
}
/**
 * Your _303 object will be instantiated and called as such:
 * _303 obj = new _303(nums);
 * int param_1 = obj.sumRange(i,j);
 */