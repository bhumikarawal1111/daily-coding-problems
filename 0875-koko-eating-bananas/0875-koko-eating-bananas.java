class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int low =1;//speed =1
        int high =0; //max num from array
        int ans=0;

        for(int a:piles){
            high = Math.max(a, high);
        }

        while(low <= high){
            int mid = low+(high-low)/2;

            if(canFinish(piles, mid,h) ==true){
                ans= mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
     return ans;
    }
    public boolean canFinish(int[]piles, int speed,int h){
        long totaltime=0;
        for(int i=0; i<piles.length; i++){
          int time = piles[i] / speed;

          if(piles[i]%speed !=0){
               time+=1;
           }
              totaltime+=time;
        }
        
        if(totaltime<=h){
            return true;
        }
        return false;

    }
}