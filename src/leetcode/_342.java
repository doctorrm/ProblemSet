package Algorithm.leetcode;

/* Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

         Example:
         Given num = 16, return true. Given num = 5, return false.

         Follow up: Could you solve it without loops/recursion?*/
public class _342 {
    public boolean isPowerOfFour(int num) {//更快更简洁！
        return num > 0 && (num & (num - 1)) == 0 && (num - 1) % 3 == 0;
    }

    public boolean isPowerOfFour2(int num) {
        String strNum = Integer.toString(num, 2);
        int countOne = 0;
        for (int i = 1; i != strNum.length(); i++) {
            if (strNum.charAt(i) == '1') {
                return false;
            } else {
                countOne++;
            }
        }
        if (strNum.charAt(0) == '1' && countOne % 2 == 0) return true;
        return false;
    }
}
