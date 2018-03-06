package Algorithm.leetcode;
/*
Given a string S, we can transform every letter individually to be
        lowercase or uppercase to create another string. Return a list of all
        possible strings we could create.

        Examples: Input: S = “a1b2” Output: [“a1b2”, “a1B2”, “A1b2”, “A1B2”]

        Input: S = “3z4” Output: [“3z4”, “3Z4”]

        Input: S = “12345” Output: [“12345”]

        Note:

        S will be a string with length at most 12.
        S will consist only of letters or digits.
*/
import java.util.*;

public class _784 {
    public List<String> letterCasePermutation(String S) {
        LinkedList<String> res = new LinkedList<>();
        res.add(S);
        for (int i = 0; i != S.length(); i++) {
            char letter = S.charAt(i);
            if (Character.isLetter(letter)) {//
                int size = res.size();
                for (; size != 0; size--) {//不能用res.size()，因为下面res会再次增加，从而造成死循环
                    String str = res.poll();
                    res.offer(str.substring(0, i) + Character.toUpperCase(letter) + str.substring(i + 1));
                    res.offer(str.substring(0, i) + Character.toLowerCase(letter) + str.substring(i + 1));
                }
            }
        }
        return res;
    }
}
