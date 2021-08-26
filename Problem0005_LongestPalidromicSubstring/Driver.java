package Problem0005_LongestPalidromicSubstring;

public class Driver {
    public static void main(String [] args){
        String palindrome1 = "babad";
        String palindrome2 = "cbbd";
        String palindrome3 = "a";
        String palindrome4 = "ac";
        String palindrome5 = "racecar";

        Solution algorithm = new Solution();

        System.out.println("Longest Palindromic Substring: " + algorithm.longestPalindrome(palindrome1));
        System.out.println("Longest Palindromic Substring: " + algorithm.longestPalindrome(palindrome2));
        System.out.println("Longest Palindromic Substring: " + algorithm.longestPalindrome(palindrome3));
        System.out.println("Longest Palindromic Substring: " + algorithm.longestPalindrome(palindrome4));
        System.out.println("Longest Palindromic Substring: " + algorithm.longestPalindrome(palindrome5));
    }
}
