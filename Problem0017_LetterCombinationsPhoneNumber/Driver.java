package Problem0017_LetterCombinationsPhoneNumber;

public class Driver {
    public static void main(String[] args){
        String numberToTestOne = "23";
        String numberToTestTwo = "";
        String numberToTestThree = "2";
        Solution algorithm = new Solution();

        System.out.println(numberToTestOne + " possible combo: " + algorithm.letterCombinations(numberToTestOne));
        System.out.println(numberToTestTwo + " possible combo: " + algorithm.letterCombinations(numberToTestTwo));
        System.out.println(numberToTestThree + " possible combo: " + algorithm.letterCombinations(numberToTestThree));
    }
}
