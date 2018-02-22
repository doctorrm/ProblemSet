package Algorithm.leetcode;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class _35 {
    /**
     * 直接暴力搜索
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert1(int[] nums, int target) {
        if (nums[nums.length - 1] < target) {//当末尾比target还要小时
            return nums.length;
        }
        if (nums[0] > target) {//当头部比target还要大时
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {//遍历数组
            if (nums[i] == target) {//如果找到相等的，直接返回
                return i;
            }
            //注意判断i+1不能越界
            if (nums[i] < target && i + 1 < nums.length && nums[i + 1] > target) {//如果没找到相等的，并且能在前后两个数大小之间的，返回后一个数的坐标
                return i + 1;
            }
        }
        return -1;
    }

    /**
     * 使用二分查找
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start) / 2;
            //获取中间左边，比较过程中start和end都在变化
            if(nums[mid]<target) {
                start = mid + 1;
            } else if(nums[mid]>target) {
                end = mid - 1;
            } else
                return mid;
        }

        return start;
    }

}
