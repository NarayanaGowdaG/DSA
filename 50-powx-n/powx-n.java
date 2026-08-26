class Solution {
    public double myPow(double x, int n) {
           long Num=n;
          if(Num<0){
            x=1/x;
        Num=-1*Num;
          }
          double ans=1;
          while(Num>0){
            if(Num%2==1){
                ans=x*ans;
            Num--;
          }
          else{
          x=x*x;
          Num= Num/2;
          }

    }
    return ans;
        
    }
}