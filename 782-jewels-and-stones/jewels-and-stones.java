class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=jewels.length();
        int m=stones.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            char ch=jewels.charAt(i);
            for(int j=0;j<m;j++){
            if(ch==stones.charAt(j)){
                cnt++;
            }
        }
        
    }
    return cnt;
}
}