class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0)return 0;
        int cnt=0;
        Set<Character> st=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(st.contains(s.charAt(i))){
                st.remove(s.charAt(i));
                cnt++;
            }
            else{
                st.add(s.charAt(i));
            }
        }
if(st.isEmpty())return 2*cnt;
return 2*cnt+1;
        
    }
}