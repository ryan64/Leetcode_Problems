package Problem0008_StringToInt;

public class Driver {
    public static void main(String[] args){
        String negativeNumber = "-45";
        String positiveNumber = "100";
        String whiteSpaceNumber = "     -46";
        int negativeNumberConverted = 0;
        int positiveNumberConverted = 0;
        int whiteSpaceNumberConverted = 0;

        Solution algorithm = new Solution();
        negativeNumberConverted = algorithm.myAtoi(negativeNumber);
        positiveNumberConverted = algorithm.myAtoi(positiveNumber);
        whiteSpaceNumberConverted = algorithm.myAtoi(whiteSpaceNumber);

        System.out.println("Integer pos#: " + positiveNumberConverted + " Integer neg#: " + negativeNumberConverted);
        System.out.println("Integer whitespace #: " + whiteSpaceNumberConverted);
    }
}
