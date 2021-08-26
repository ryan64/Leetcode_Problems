package Problem0268_MissingNumber;

public class Driver {
    public static void main(String[] args){
        int[] nums = {3,0,1};
        Solution algorithm = new Solution();
        System.out.println("Number that is missing is: " + algorithm.missingNumber(nums));
    }
}
