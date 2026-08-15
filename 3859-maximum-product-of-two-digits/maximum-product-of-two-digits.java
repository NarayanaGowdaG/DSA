class Solution {
    public int maxProduct(int n) {
        int max1=-1;
        int max2=-1;
        while(n>0){
            int lastdig=n%10;
              if (lastdig >= max1) {
                max2 = max1;
                max1 = lastdig;
            } else if (lastdig > max2) {
                max2 = lastdig;
            }
            n=n/10;
        }
      return max1*max2;  
    }
}