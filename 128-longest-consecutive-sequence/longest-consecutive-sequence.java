class Solution {
    public int longestConsecutive(int[] nums) {
         int n=nums.length;
          int longest=1;
         if(n==0)return longest=0;
        Arrays.sort(nums);
        int curcnt=0;
        int lastsml=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastsml){
                curcnt++;
                lastsml=nums[i];
            }
            else if(nums[i]!=lastsml){
                curcnt=1;
                lastsml=nums[i];
            }
longest=Math.max(curcnt,longest);
            }
            return longest;
        }

        
    }
