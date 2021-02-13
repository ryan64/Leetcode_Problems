package Problem3_LongestSubstringWoRepeatingChar;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> uniqueChar = new HashSet<>();

        if (s == null || s.equals("")){
            return 0;
        }

        while(end < s.length()){
            if (uniqueChar.add(s.charAt(end))){
                end++;
                maxLength = Math.max(maxLength, uniqueChar.size());
            } else {
                uniqueChar.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}
