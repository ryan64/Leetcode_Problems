package Problem0017_LetterCombinationsPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<String, String> numberToLetterMapper = new HashMap<>();
        numberToLetterMapper.put("0", "");
        numberToLetterMapper.put("1", "");
        numberToLetterMapper.put("2", "abc");
        numberToLetterMapper.put("3", "def");
        numberToLetterMapper.put("4", "ghi");
        numberToLetterMapper.put("5", "jkl");
        numberToLetterMapper.put("6", "mno");
        numberToLetterMapper.put("7", "pqrs");
        numberToLetterMapper.put("8", "tuv");
        numberToLetterMapper.put("9", "wxyz");

        List<String> possibleOutcomes = new ArrayList<>();

        if (digits.length() == 0){
            return possibleOutcomes;
        }

        for (int i = 0; i < digits.length(); i++){
            char currNum = digits.charAt(i);
            String currentValueForKey = numberToLetterMapper.get(Character.toString(currNum));
        }

        return possibleOutcomes;
    }
}
