package Problem7_ReverseInteger;

public class Driver {
    public static void main(String[] main){
        int number = 4536;
        int reversedNumber = 0;
        Solution algorithm = new Solution();

        reversedNumber = algorithm.reverse(number);
        System.out.println(number + " reversed is: " + reversedNumber);
    }
}
