package Problem0003_LongestSubstringWoRepeatingChar;

public class Driver {
    public static void main(String[] args){
        String substringTest = "abcabcbb";
        Solution algorithm = new Solution();
        System.out.println("The length of the longest substring is: " + algorithm.lengthOfLongestSubstring(substringTest));
    }
}
