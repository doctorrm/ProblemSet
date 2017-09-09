package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that <strong>Each input would
 * have exactly one solution</strong>, and you <strong>May not use the same
 * element twice</strong>.
 * 
 * Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] =
 * 2 + 7 = 9, return [0, 1].
 *
 * @Author doctorrm
 * @Time 2017-08-31 下午11:32:51
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 17;
		int[] resultArray = twoSum3(nums, target);
		displayResult(resultArray);

	}

	/*************** My Solution ***********/
	/**
	 * (Brute Force) Written by myself(modified a little with official
	 * solutions) . Logic is simple:just iterate array. <strong>Complexity
	 * Analysis</strong> Time complexity : O(n^2). For each element, we try to
	 * find its complement by looping through the rest of array which takes O(n)
	 * time. Therefore, the time complexity is O(n^2). Space complexity : O(1).
	 */
	public static int[] twoSum1(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No result found in array.");
	}

	/*************** Official Solutions *****/
	/**
	 * (Two-pass Hash Table). Time Complexity: O(n^2) ; Space Complexity: O(1)
	 */
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	/**
	 * (One-pass Hash Table).Time Complexity: O(n^2) ; Space Complexity: O(1)
	 */
	public static int[] twoSum3(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	/*************** tools *****************/
	public static void displayResult(int[] resultArray) {
		String result = "Result:[";
		for (int i = 0; i < resultArray.length; i++) {
			result = result + resultArray[i] + ",";
		}
		result = result.substring(0, result.length() - 1) + "]";
		System.out.println(result);
	}

}
