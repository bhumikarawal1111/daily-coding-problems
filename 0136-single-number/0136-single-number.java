class Solution {
    public static int singleNumber(int[] nums) {
        for(int i=0 ; i<nums.length-1; i++){
           nums[i+1]= nums[i]^nums[i+1];
        }

        return nums[nums.length-1];
    }
    public static void main(String args[]){
        int nums[]={2,2,1};
        int el= singleNumber(nums);
        System.out.println(el);
    }

}