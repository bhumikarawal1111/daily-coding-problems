class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxarea =0;
        while(l<r){
            int minH = Math.min(height[l], height[r]);
            int area = (r-l) * minH;
            maxarea = Math.max(area, maxarea);

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }

        }
        return maxarea;
    }
}