package Algorithm.leetcode;

/*
Given a word,you need to judge whether the usage of capitals in it
is right or not.

We define the usage of capitals in a word to be right when one of the
following cases holds:

All letters in this word are capitals,like"USA".
All letters in this word are not capitals,like"leetcode".
Only the first letter in this word is capital if it has more than one letter,like"Google".


Otherwise,we define that this word doesn’t use capitals in a right
way.

Example 1:

Input: “USA” Output:True

Example 2:

Input: “FlaG” Output:False

Note:The input will be a non-empty word consisting of uppercase and
lowercase latin letters.

*/

public class _520 {
    //方法一（1，3为一组；2为一组 ）：
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        int first = word.charAt(0);
        if (first < 91) {//开头是大写字母。
            if (word.charAt(1) < 91) {//第二个字母也是大写字母，剩下的就必须都是大写的，否则返回false
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i) > 91) return false;
                }
                return true;
            } else {//第二个字母是小写字母，剩下的也必须都是小写的，否则返回false
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i) < 91) return false;
                }
                return true;
            }

        } else {//首字母是小写字母
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) < 91) return false;//一出现大写就false
            }
            return true;
        }
    }

    //  方法二（1为一组；2，3为一组）：
    public boolean detectCapitalUse2(String word) {
        if (word.toUpperCase().equals(word)) {
            return true;
        }
        word = word.substring(1);
        return word.toLowerCase().equals(word);
    }
}
