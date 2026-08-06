class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int pro=productDig(n);
            if(pro%t==0)return n;
            n++;
        }
     
    }
    private int productDig(int num){
        int pro=1;
        while(num>0){
            int dig=num%10;
            pro=pro*dig;
            num=num/10;
        }
        return pro;
    }
}