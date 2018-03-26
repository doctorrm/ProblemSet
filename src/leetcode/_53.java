package Algorithm.leetcode;

/*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

        For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
        the contiguous subarray [4,-1,2,1] has the largest sum = 6.

        click to show more practice.
        More practice:

        If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/
public class _53 {
    public int maxSubArray(int[] nums) {
        int[] maxs = new int[nums.length];
        maxs[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i != nums.length; i++) {
            int now = nums[i];
            maxs[i] = now + (maxs[i - 1] > 0 ? maxs[i - 1] : 0);        /*It's like squeezing milk into different buckets and do some collection for healthy milk. Bad milk are negative, which has no volume in the bucket . Every visit to the 'NOW' bucket(index is i) will need the last bucket's milk( can be poured into 'NOW' bucket  with volume>0 OR be poured with 0 content of milk) .*/
            max = Math.max(max, maxs[i]);
        }
        return max;
    }
}
