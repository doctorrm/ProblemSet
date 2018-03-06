package Algorithm.leetcode;

public class _292 {
    /**
     * n为4的倍数：谁先谁死；n不是4的倍数：谁先谁赢
     * 时间复杂度为O(1),空间复杂度为O(1)
     */
    public boolean canWinNim(int n) {
        return (n & 0b11) != 0;
    }
}
