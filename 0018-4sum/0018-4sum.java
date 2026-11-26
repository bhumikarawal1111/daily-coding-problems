class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //nums[a] + nums[b] + nums[c] + nums[d] == target
        // a!=b!=c!=d
        //1 - sort arr for 2-pointer approach
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> uniqueAns = new ArrayList<>();

        //2- loop for i
        //loop for j = i+1
        // to test combinations for i and j
        for(int i=0; i<n ; i++){
            //1st optimization 
            if(i>0 && nums[i] == nums[i-1])continue;
            for(int j= i+1; j<n;){
                //2 pointers used for choosing c and d
                int c = j+1; //c at lowest num
                int d = n-1; //d at largerst num

                while(c<d){

                    long sum = (long)nums[i] + (long)nums[j]+ (long)nums[c] + (long)nums[d];

                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[c], nums[d]));
                        c++;
                        d--;

                        //3rd optimization
                        while(c<d && nums[c] == nums[c-1])c++;
                    }
                    else if(sum < target){
                        c++;
                    }else{
                        d--;
                    }
                }
                //2nd optimization
                j++;
                while(j<n && nums[j] == nums[j-1])j++;
            }
        } 
         
        return ans;
    }
}