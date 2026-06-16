import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        HashMap<Integer , Integer> m = new HashMap<>();
        for(int i=0 ; i<n; i++){
            int el = target - nums[i];
            if(m.containsKey(el)){
                return new int[]{m.get(el) , i};
            }
            m.put(nums[i], i);
        }
       return new int[]{}; 
    }
    
}
