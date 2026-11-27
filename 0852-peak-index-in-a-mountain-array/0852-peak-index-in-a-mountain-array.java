class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]< arr[i+1])continue;
            else{
                idx =i;
                break;
            }
        }
        return idx;
    }
}