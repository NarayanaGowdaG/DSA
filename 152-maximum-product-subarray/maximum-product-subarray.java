class Solution {
    public int maxProduct(int[] nums) {
        
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int suf=1;
        int pre=1;
        for(int i=0;i<n;i++){
            if(pre==0)pre=1;
            if(suf==0)suf=1;
            pre=pre*nums[i];
            suf=suf*nums[n-i-1];
            maxi=Math.max(maxi,Math.max(pre,suf));
        }

      return maxi;  
    }
    }
