package Problem0020_ValidParenthesis;

import Problem0020_ValidParenthesis.Solution;

public class Driver {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        boolean o1 = false;
        boolean o2 = false;
        boolean o3 = false;

        Problem0020_ValidParenthesis.Solution algorithm = new Solution();
        o1 = algorithm.isValid(s1);
        o2 = algorithm.isValid(s2);
        o3 = algorithm.isValid(s3);

        System.out.println("Input s1: " + o1);
        System.out.println("Input s2: " + o2);
        System.out.println("Input s3: " + o3);
    }
}
