package Problem0050_PowXN;

public class Driver {
    public static void main(String[] args){
        /*double x = 1.0;
        int n = 2147483647;*/

        double x = 2.0;
        int n = -2147483648;

        Solution algorithm = new Solution();
        System.out.println(x + " raised to " + n + " = " + algorithm.myPow(x, n));
    }
}
