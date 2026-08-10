class Solution {
    public int search(int[] nums, int target) {
        return func(nums,0,nums.length-1,target);
       }
       private int func(int[] nums,int low,int high,int target){
        if(low>high)return -1;
        int mid=(low+high)/2;
        if(nums[mid]==target)return mid;
        else if(target>nums[mid])return func(nums,mid+1,high,target);
        return func(nums,low,mid-1,target);
       }
        
    }
