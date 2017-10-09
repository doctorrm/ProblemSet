package leetcode;

public class LengthOfLongestSubstring {
	public static void main(String[] args) throws Exception {
		System.out.println(lengthOfLongestSubstring01("abcdefgwonderlandandyouandme"));
		//System.out.println(lengthOfLongestSubstring("abcdefgwonderlandandyouandme"));
	}
	
	/**983 / 983 test cases passed.
	 * Runtime: 218 ms
	 * 
	 * iterate from 1st,stop when will meet same char,save len1;iterate from 2nd...
	 * compare maxLen with the left non-iterate str,if prev>post,stop and return result.
	 * 
	 * @param input
	 * @return
	 */
	public static int lengthOfLongestSubstring(String input) {
		int strLen = input.length();
		if(strLen==0){
			return 0;
		}
		if (strLen == 1) {
			return 1;
		}
		int right_len = -1;
		int len1 = 1;
		int maxLen = len1;
		for (int i = 0; i < strLen; i++) {
			len1 = 1;// a new loop,a new len1 begin with 0;
			for (int j = i; j < strLen - 1; j++) {// care the last char situation.
				boolean isUnique=false;
				for(int k=i;k<j+1;k++){//eg:'weqw'
					if (input.charAt(k) == input.charAt(j + 1)){//now j+1 is invariable,k is variable.
						isUnique=false;
						break;//one you meet same,just break,eg:'weq w'.
					}
				    if (k==j) {
						isUnique=true;
					}
				}
				if (isUnique==true) {					
					len1 = len1 + 1;
				} else {// jump out of loop when will encounter same char.
					break;
				}
			}
			//System.out.println("len1:" + len1);
			if (len1 >= maxLen) {
				maxLen = len1;
			}
			//System.out.println("maxLen:" + maxLen);
			right_len = strLen - 1 - i;
			//System.out.println("rightLen:" + right_len + "\n");
			if (maxLen >= right_len) {
				return maxLen;
			}

		}
		return -1;
	}

	/**
	 * sample 35 ms submission(maybe the fastest)
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring01(String s) {
        int[] idx = new int[128];
        for(int i = 0; i < idx.length; i++) idx[i] = -1;
        
        int ans = 0, start = 0;
        for(int i = 0; i < s.length(); i++){
            int cIdx = s.charAt(i);
            if(idx[cIdx]>=start)  start = idx[cIdx]+1;               
            idx[cIdx] = i;
            ans = Math.max(ans, i-start+1);
        }
        return ans;
    }
}
