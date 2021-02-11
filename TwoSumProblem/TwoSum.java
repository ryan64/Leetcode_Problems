package TwoSumProblem;

class TwoSum {
    //Driver Code
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] answer = new TwoSum().twoSum(nums, 9);
        for (int i : answer) System.out.println(i);
    }

    //Implemented Solution
    public int[] twoSum(int[] nums, int target) {
        int currentValue = 0;
        int nextValue = 0;
        int sumOfValues = 0;
        int[] answerArray = new int[2];

        for (int i = 0; i < nums.length; i++){
            currentValue = nums[i];
            for (int j = i+1; j < nums.length; j++){
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