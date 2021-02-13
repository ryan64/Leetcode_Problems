package Problem0009_PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int number = x;
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        if (x == reverse){
            return true;
        }
        else
            return false;
    }
}
