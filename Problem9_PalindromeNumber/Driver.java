package Problem9_PalindromeNumber;

public class Driver {
    public static void main(String[] args){
        int numberToTestOne = -121;
        int numberToTestTwo = 121;
        int numberToTestThree = 223;
        Solution algorithm = new Solution();

        System.out.println(numberToTestOne + " is a palindrome: " + algorithm.isPalindrome(numberToTestOne));
        System.out.println(numberToTestTwo + " is a palindrome: " + algorithm.isPalindrome(numberToTestTwo));
        System.out.println(numberToTestThree + " is a palindrome: " + algorithm.isPalindrome(numberToTestThree));
    }
}
