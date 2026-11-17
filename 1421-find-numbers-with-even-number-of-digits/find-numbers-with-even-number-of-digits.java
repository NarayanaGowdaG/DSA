class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int cnt1=0;
        for(int i=0;i<n;i++){
            cnt=countDigit(nums[i]);
            if(cnt%2==0)cnt1++;
           
        }
        return cnt1;
    }
private int countDigit(int n) {
        if(n==0) return 1 ;
        int count=0;

        while(n>0){
        count++;
        n=n/10;

        }
        return count;
        
    }
}