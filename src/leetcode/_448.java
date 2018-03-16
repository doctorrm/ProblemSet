package Algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
448. Find All Numbers Disappeared in an Array
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

        Find all the elements of [1, n] inclusive that do not appear in this array.

        Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

        Example:

        Input:
        [4,3,2,7,8,2,3,1]

        Output:
        [5,6]
*/
public class _448 {
    public List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {//想的是把每个元素的值当作index（坐标），对于在此坐标上的元素做一个标记，这里把元素取负。
            int val = Math.abs(nums[i]) - 1;//abs也是防止一些数已经变成负的情况
            if (nums[val] > 0) {//因为有的数字出现两次，第一次的时候对应的index元素值已经变为负，已经是负数的就不再处理
                nums[val] = -nums[val];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ret.add(i + 1);
            }
        }
        return ret;
    }

    //更好理解
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> a=new ArrayList();
        int n=nums.length;
        boolean array[]= new boolean[n+1];//开辟额外的空间
        for(int i=0;i<n;i++)
        {
            array[nums[i]]=true;//把元素值当作array中的坐标

        }
        for(int i=1;i<=n;i++)
        {
            if(array[i]==false)
                a.add(i);

        }
        return a;
    }
}
