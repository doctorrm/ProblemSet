package Algorithm.leetcode;
/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

        Note:

        The length of both num1 and num2 is < 5100.
        Both num1 and num2 contains only digits 0-9.
        Both num1 and num2 does not contain any leading zero.
        You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

public class _415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        String res = "";
        while (i >= 0 || j >= 0) {
            if (i >= 0)
                carry += num1.charAt(i--) - '0';//从ASCII字符转化为整形
            if (j >= 0)
                carry += num2.charAt(j--) - '0';
            res = Integer.toString(carry % 10) + res;
            carry /= 10;
        }
        return carry != 0 ? "1" + res : res;
    }
}
