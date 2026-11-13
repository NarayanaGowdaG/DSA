class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         int n=nums.length;
     List<Integer> list=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    func(0,list,ans,nums,n);
    return ans;

        
    }
    private void func(int ind,List<Integer>list,List<List<Integer>>ans,int []nums,int n){
        if(ind==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[ind]);
        func(ind+1,list,ans,nums,n);
        list.remove(list.size()-1);
     func(ind+1,list,ans,nums,n);

    }

}