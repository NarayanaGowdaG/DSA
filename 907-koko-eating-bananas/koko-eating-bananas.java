class Solution {
     private int func(int[] piles,int hourly){
        int totalhrs=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            totalhrs+=Math.ceil((double)piles[i]/hourly);
        }
        return totalhrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
          int n=piles.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        int low=1;
        int high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
             int totalhrs=func(piles,mid);
            if(totalhrs<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
       return low; 
    }
}