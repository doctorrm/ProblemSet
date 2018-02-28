package Algorithm.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class _14 {
    public static void main(String[] args) {
        _14 test=new _14();
        String[] strs={"hello","hel","fds"};
        test.longestCommonPrefix(strs);
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        for(int i=1;i<strs.length;i++){
            while (strs[i].indexOf(pre) != 0) {//关键：正常下都是0位匹配到整个strs[0],如hello,helloa.
                System.out.print(strs[i].indexOf(pre)+"这里\t");
                pre=pre.substring(0,pre.length()-1);
                System.out.println(pre);
            }
        }
        return pre;
    }
}
