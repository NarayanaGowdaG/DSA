class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String x="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                x+=s.charAt(i);
            }

        
            int len=x.length();
            int l=0;
            int r=len-1;
            while(l<r){
                if(x.charAt(l)!=x.charAt(r))return false;
                l++;
                r--;
            }
return true;
        }
    }
