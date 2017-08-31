package leetcode;

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
 * @Time 2017-08-31 ÏÂÎç11:32:51
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 17;
		int[] resultArray = twoSum1(nums, target);
		displayResult(resultArray);

	}

	public static int[] twoSum1(int[] nums, int target) {
		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					break;
				}
			}
		}
		return output;
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
