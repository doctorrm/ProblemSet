package Algorithm.leetcode;

import java.util.Arrays;

/*136. Single Number
        DescriptionHintsSubmissionsDiscussSolution

        Given an array of integers, every element appears twice except for one. Find that single one.

        Note:
        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

public class _136 {
    //先排序，相邻的基本都为相同的，i=i+2，不同的即为所求数
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i=i+2){
            if(i==nums.length-1) return nums[nums.length-1];
            if(nums[i]!=nums[i+1]){
                res=nums[i];
                break;
            }
        }
        return res;
    }

    //从全体数来看，全部的数异或之后等于目标值，相同的数的异或会得到0000.。。
    public int singleNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
