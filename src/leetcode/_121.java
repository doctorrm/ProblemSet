package Algorithm.leetcode;
/*
Say you have an array for which the ith element is the price of a given stock on day i.

        If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

        Example 1:

        Input: [7, 1, 5, 3, 6, 4]
        Output: 5

        max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

        Example 2:

        Input: [7, 6, 4, 3, 1]
        Output: 0

        In this case, no transaction is done, i.e. max profit = 0.
*/

public class _121 {
    //求最大子序列的和（有顺序的），区别挤牛奶的无序最大子序列
    //如果你画出股票图的话会很好理解
    public int maxProfit(int[] prices) {
        int finalMax = 0;
        int temp_max = 0;
        for (int i = 1; i < prices.length; i++) {
            temp_max = Math.max(0, temp_max + prices[i] - prices[i - 1]);
            finalMax = Math.max(temp_max, finalMax);
        }
        return finalMax;
    }
}
