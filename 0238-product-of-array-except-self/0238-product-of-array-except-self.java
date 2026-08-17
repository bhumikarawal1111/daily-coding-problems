class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        int leftArr[] = new int[n];
        int rightArr[] = new int[n];

        leftArr[0] =1;
        rightArr[n-1] = 1;

        for(int i=1; i<n ; i++){
            int lastElProd = leftArr[i-1];
            int currProd = lastElProd  * nums[i-1];
            leftArr[i] = currProd;
        }
        for(int i = rightArr.length-2; i>=0 ; i--){
            int prevElProd = rightArr[i+1];
            int currProd = prevElProd * nums[i+1];
            rightArr[i] = currProd;
        }
        for(int i=0; i<n ; i++){
           answer[i] = rightArr[i] * leftArr[i]; 
        }
        return answer;
        
    }
}