package Problem0050_PowXN;

public class Solution {
    public double myPow(double x, int n) {
        double result = x;
        boolean isNegative = false;
        long power = n;

        //1 raised to anything is 1
        if (x == 1.0){
            return 1;
        }

        if (power < 0) {
            isNegative = true;
        }

        if (power == 0){
            result = 1.0;
        }
        else if (isNegative == false){
            for (int i = 1; i < power; i++){
                result = result * x;
            }
        }
        else {
            long number = -power;
            System.out.println("Number is: " + number);
            for (long i = 1; i < number; i++){
                result = result * x;
            }
            result = 1 / result;
        }

        return result;
    }
}
