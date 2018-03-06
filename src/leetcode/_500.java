package Algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _500 {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();//String[]是不可变数组，List是可变列表，后面再把List转为数组
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i != words.length; i++) {
            String item = words[i].toLowerCase();//比如：asdkkk,注意要降为小写的
            for (int j = 0; j != item.length(); j++) {
                if (first.indexOf(item.charAt(j)) != -1) count1++;
                if (second.indexOf(item.charAt(j)) != -1) count2++;
                if (third.indexOf(item.charAt(j)) != -1) count3++;
            }
            if (count1 == item.length() || count2 == item.length() || count3 == item.length()) {
                res.add(words[i]);
            }
            count1 = 0;
            count2 = 0;
            count3 = 0;//注意清零
        }
        return res.toArray(new String[0]);//列表转为数组
    }
}
