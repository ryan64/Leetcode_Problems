package Problem0005_LongestPalidromicSubstring;

public class Solution {
    public boolean isPal(String s){
        int len = s.length();
        if(len == 1){
            return true;
        }
        for(int i = 0 ; i< len/2 ; i++){
            if(s.charAt(i) != s.charAt(len-1-i))
                return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int len = s.length();

        String ans = s.substring(0,1);
        int lenans = 1;
        if (len == 0 || len == 1){
            return s;
        }

        for(int i = 1; i <= len; i++){
            for(int j = 0 ; i + j <= len ; j++){
                //System.out.println(s.substring(j,j+i));
                String str = s.substring(j, j+i);
                if(isPal(str)){
                    ans = str;
                    lenans = i;
                    break;
                }
            }
        }

        return ans;
    }
}
