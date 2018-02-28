package Algorithm.leetcode;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class _198 {
    //动态规划DP
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int now = 0;
        int last = 0;
        for (int i = 0; i < nums.length; i++) {//不懂
            int temp = last;
            last = now;
            now = Math.max(now, nums[i] + temp);//i-2:temp;     i-1:now;     i:nums[i]
        }

        return now;//所rob的总钱数
    }

}
