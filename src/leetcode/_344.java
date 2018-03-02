package Algorithm.leetcode;

/*Write a function that takes a string as input and returns the string reversed.

        Example:
        Given s = "hello", return "olleh".*/
public class _344 {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        char[] res = new char[len];//构造另一个数组来存放结果
        for (int i = 0; i < len; i++) {
            res[len - 1 - i] = arr[i];//头对尾，尾对头
        }
        String ret = new String(res);//将结果的char array转化为String
        return ret;
    }

    public String reverseString2(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
