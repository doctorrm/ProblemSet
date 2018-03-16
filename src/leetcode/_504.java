package Algorithm.leetcode;

/*
Given an integer, return its base 7 string representation.

        Example 1:

        Input: 100
        Output: "202"

        Example 2:

        Input: -7
        Output: "-10"

        Note: The input will be in range of [-1e7, 1e7].
*/
public class _504 {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean flag = num < 0 ? true : false;
        num = Math.abs(num);
        StringBuffer sb = new StringBuffer();
        int last = -1;
        while (num != 0) {
            last = num % 7;
            sb.append(last);
            num = num / 7;
        }
        sb.reverse();
        String res = sb.toString();
        return flag == true ? "-" + res : res;
    }
}
