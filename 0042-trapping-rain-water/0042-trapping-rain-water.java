class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int ans =0;
        int larr[] = new int[n];
        int rarr[] = new int[n];

        //finding leftMAx , rightMax
        //min among them 
        //water = minH - own height
        larr[0] = height[0];
        rarr[n-1] = height[n-1];

        for(int i=1; i<n ; i++){
            larr[i] = Math.max(larr[i-1] , height[i]);
        }
        for(int i=n-2; i>=0; i--){
            rarr[i] = Math.max(rarr[i+1], height[i]);
        }
        for(int i=0; i<n; i++){
            int lmax = larr[i];
            int rmax = rarr[i];
            ans += Math.min(lmax, rmax) - height[i];
        }
     return ans;   
    }
}