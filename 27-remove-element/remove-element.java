class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int ind=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[ind++]=nums[i];
            }
        }
      return ind;   
    }
}