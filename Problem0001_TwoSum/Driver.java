package Problem0001_TwoSum;

public class Driver {
    //Driver Code
    public static void main(String[] args) {
        Solution algorithm = new Solution();

        int[] nums = {2,7,11,15};
        int[] answer = algorithm.twoSum(nums, 9);
        for (int i : answer) System.out.println(i);
    }
}
