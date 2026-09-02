class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        func(k,n,ans,list);
        return ans;
 }
 private void func(int k,int sum,List<List<Integer>> ans,List<Integer> list){
    if(sum==0 && list.size()==k){
        ans.add(new ArrayList<>(list));
        return;
    }
    if(sum<0 || list.size()>k)return;
    int element = list.isEmpty() ? 1 : list.get(list.size() - 1) + 1;
    for(int i=element;i<=9;i++){
        if(i<=sum){
            list.add(i);
            func(k,sum-i,ans,list);
            list.remove(list.size()-1);
        }
        else{
            break;
        }
    }

 }
}