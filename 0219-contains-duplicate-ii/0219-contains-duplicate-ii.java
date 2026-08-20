class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n ; i++){
            int key = nums[i];

            if(map.containsKey(key) && i-map.get(key) <= k){
                return true;
            }
            else{
                map.put(key, i);
            }
            
        }
        return false;
    }
}