package Problem0268_MissingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missingNumber = 0;
        boolean isMissingNumber = false;

        for (int i = 0; i < n; i++){
            if (nums[i] == i) {
                isMissingNumber = true;
                missingNumber = i;
            }
        }

        return 0;
    }
}
