class Solution {
    String[] comb={"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits.length()==0)return ans;
        String current = "";
        func(0,current,ans,digits);
        return ans;
}
private void func(int ind, String current, List<String>ans,String digits){
    if(ind==digits.length()){
        ans.add(current);
        return;
    }
    int number=digits.charAt(ind)-'0';
    for(int i=0;i<comb[number].length();i++){
        func(ind+1,current+comb[number].charAt(i),ans,digits);
    }
}
}