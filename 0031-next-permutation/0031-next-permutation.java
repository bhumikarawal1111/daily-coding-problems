class Solution {
    public int[] reverse(int[] arr, int st, int end){
        while(st < end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;

        st++;
        end--;
        }
        return arr;
    }
    public void nextPermutation(int[] nums) {
        int p=0,q=0;
        int n = nums.length;
        for(int i=n-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                p = i-1;
                break;
            }
        }

        for(int i=n-1; i>0; i--){
            if(nums[i]>nums[p]){
                q = i;
                break;
            }
        }
        if(p==q){
            reverse(nums, 0, n-1);
            return;
        }
        //3 swap
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
        //4 revrse left array from p-1
        reverse(nums, p+1, n-1);
        
    }
}