package TwoSumProblem;

public class Driver {
    //Driver Code
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] answer = new TwoSum().twoSum(nums, 9);
        for (int i : answer) System.out.println(i);
    }
}
