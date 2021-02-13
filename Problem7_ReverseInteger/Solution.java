package Problem7_ReverseInteger;

public class Solution {
    public int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number;
        }
        long reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        if (reversedNumber > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reversedNumber : reversedNumber);
    }
}
