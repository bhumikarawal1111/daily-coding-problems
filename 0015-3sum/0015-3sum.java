class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for(int i=0; i<n; i++){

            int target = -(nums[i]);
            Set<Integer> s = new HashSet<>();

            for(int j=i+1; j<n ; j++){

                int thirdNum = target - nums[j];

                if(s.contains(thirdNum)){

                    List<Integer> t1 = Arrays.asList(nums[i], nums[j], thirdNum);
                    Collections.sort(t1);
                    uniqueTriplets.add(t1);
                    
                }
                s.add(nums[j]);
                
            }
        }
        return new ArrayList<>(uniqueTriplets);        
    }
}