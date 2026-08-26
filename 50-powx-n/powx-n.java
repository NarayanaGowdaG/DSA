class Solution {
    public double myPow(double x, int n) {
        long num = n;
        if (num < 0) {
           x=1/x;
           num=-num;
        }
        return power(x, num);
    }
    private double power(double x, long n) {
        if (n == 0) return 1.0;
        if (n % 2 == 1) {
            return x * power(x, n - 1);
        }
     return power(x * x, n / 2);
    }

        
    }