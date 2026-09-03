class Solution {
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>>ans=new ArrayList<>();
        List<String>list=new ArrayList<>();
        func(0,list,ans,s,n);
        return ans;
}
private void func(int ind,List<String>list, List<List<String>>ans,String s,int n){
    if(ind==n){
        ans.add(new ArrayList<>(list));
        return;
    }
    for(int i=ind;i<n;i++){
        if(checkPal(s,ind,i)){
            String sub=s.substring(ind,i+1);
            list.add(sub);
            func(i+1,list,ans,s,n);
            list.remove(list.size()-1);
        }
    }
}
private boolean checkPal(String s,int left,int right){
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}