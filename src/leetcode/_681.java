package Algorithm.leetcode;

/*Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

        The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

        Example 1:

        Input: "UD"
        Output: true

        Example 2:

        Input: "LL"
        Output: false
*/
public class _681 {
    public boolean judgeCircle(String moves) {
        char[] ms = moves.toCharArray();
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;
        for (char item : ms) {
            if (item == 'U') u++;
            if (item == 'D') d++;
            if (item == 'L') l++;
            if (item == 'R') r++;
        }
        if (u == d && l == r) {
            return true;
        } else {
            return false;
        }
    }
}
