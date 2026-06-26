public class Solution{
    public static int majorityElement(int nums[]){
        int cnt=0;
        int el=0;
        for(int i=0; i<nums.length; i++){
           if(cnt == 0){
            cnt++;
            el= nums[i];
           }
           else if(nums[i]==el){
            cnt++;
           }
           else{
            cnt--;
           }
        }
        return el;
    }
    public static void main(String[] args){
        int nums[]={3,2,3};
        System.out.println(majorityElement(nums));
    }
}