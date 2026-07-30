class Solution {
    public int[] runningSum(int[] nums) {
        int currSum=nums[0];
        for(int i=1; i<nums.length; i++){
            currSum = nums[i] + currSum;
            nums[i] =  currSum;
        }
        return nums;
    }
}