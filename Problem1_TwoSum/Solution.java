package Problem1_TwoSum;

public class Solution {
    //Implemented Solution
    public int[] twoSum(int[] nums, int target) {
        int currentValue = 0;
        int nextValue = 0;
        int sumOfValues = 0;
        int[] answerArray = new int[2];

        for (int i = 0; i < nums.length; i++){
            currentValue = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                nextValue = nums[j];
                sumOfValues = currentValue + nextValue;
                if (sumOfValues == target){
                    answerArray[0] = i;
                    answerArray[1] = j;
                }
            }
        }
        return answerArray;
    }
}