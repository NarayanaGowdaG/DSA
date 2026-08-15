class Solution {
    private boolean possible(int[] nums, int day, int m, int k) {
        int n = nums.length; 
        int cnt = 0; 
        int noOfB = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] <= day) {
                cnt++; 
            } else {
                noOfB += (cnt / k);
                cnt = 0; 
            }
        }
        noOfB += (cnt / k); 
        if( noOfB >= m)return true;
        return false; 
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
         long val = (long) m * k; 
        if (val > n) return -1; 
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]); 
            maxi = Math.max(maxi, bloomDay[i]); 
        }
        int low=mini;
        int high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k))
            high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}