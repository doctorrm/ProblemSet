package Algorithm.leetcode;

import java.util.Arrays;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
public class _169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        /*int len=nums.length;
        for(int i=0;i!=len/2+1;i++){
            if(nums[i]==nums[i+len/2]){
                return nums[i];
            }
        }
        return -1;*/
    }
}
