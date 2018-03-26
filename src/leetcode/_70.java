package Algorithm.leetcode;
/*
You are climbing a stair case. It takes n steps to reach to the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        Note: Given n will be a positive integer.

        Example 1:

        Input: 2
        Output:  2
        Explanation:  There are two ways to climb to the top.

        1. 1 step + 1 step
        2. 2 steps

        Example 2:

        Input: 3
        Output:  3
        Explanation:  There are three ways to climb to the top.

        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
*/

import java.util.HashMap;

public class _70 {
    HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (memo.containsKey(n)) {//为了方便f(n-2)使用f(n-1)的过程结果，如果不用的话会超时。
            return memo.get(n);
        }
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);
        return result;
    }
}
