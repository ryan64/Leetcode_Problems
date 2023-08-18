package Problem0020_ValidParenthesis;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> inputAsStack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '(')
                inputAsStack.push(')');
            else if (c == '[')
                inputAsStack.push(']');
            else if (c == '{')
                inputAsStack.push('}');
            else if (inputAsStack.isEmpty() || inputAsStack.pop() != c)
                return false;
        }
        return inputAsStack.isEmpty();
    }
}
