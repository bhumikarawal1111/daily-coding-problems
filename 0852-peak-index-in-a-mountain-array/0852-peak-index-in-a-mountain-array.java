class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx =0;
        int n = arr.length;
        int st = 1, end = n-2;

        while(st <= end){
            int mid = st + (end - st)/2;

            if(arr[mid-1]< arr[mid] && arr[mid+1]< arr[mid] ){
                idx = mid;
                break;
                }

            else if(arr[mid-1] < arr[mid]){ //increasing slope
                st = mid+1;
            }else{ //decreasing slope
                end = mid-1;
            }
        }
        return idx;
    }
}