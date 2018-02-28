package Algorithm.leetcode;

import java.util.Arrays;

public class _27 {
    public static void main(String[] args) {
        int[] test = {4,5};
        System.out.println(removeElement(test, 4));
        for (int item : test) {
            System.out.print(item);
        }
    }
    /**
     * 返回的是非目标值的个数。更巧妙
     * */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    /**
     * 先把目标值置换到最后面 ，然后再从右到左一个循环找到第一个其他值，返回其坐标即可
     * 时间O(n)和空间复杂度O(1)和上一个解法一致。
     * */
    public static int removeElement2(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1 && nums[0] == val) {
            return 0;
        }
        if (nums.length == 1 && nums[0] != val) {
            return 1;
        }

        int width = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                //交换位置
                int temp = nums.length - 1;
                while (temp > i && nums[temp] == val) {//>i:避免val和前面交换
                    temp = temp - 1;//temp=1,
                }
                swap(nums, i, temp);
                //结束
            }
        }
        //经过上面的操作，val都在最后面了，下面找到第一个val的位置
        int j;
        for(j=nums.length-1;j>=0;j--){
            if(nums[j]!=val) break;
        }
        return j+1;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
