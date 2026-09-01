class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> ans=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
     int n=candidates.length;
        Arrays.sort(candidates);
        func(0,candidates,list,target,ans,n);
        return ans;
        
    }
    private void func(int ind,int nums[],List<Integer>list,int sum, List<List<Integer>> ans,int n){
    if(sum==0)
    {
        ans.add(new ArrayList<>(list));
        return;
    }
    if(sum<0 || ind==n )return;
    list.add(nums[ind]);
    func(ind+1,nums,list,sum-nums[ind],ans,n);
    list.remove(list.size()-1);
    for(int j=ind+1;j<n;j++){
        if(nums[j]!=nums[ind]){
        func(j,nums,list,sum,ans,n);
        break;
         }
    
}
}
}