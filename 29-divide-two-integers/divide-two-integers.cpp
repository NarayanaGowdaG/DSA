class Solution {
public:
    int divide(int dividend, int divisor) {
                if(dividend == divisor) return 1;
        if(dividend == INT_MIN && divisor == -1) return INT_MAX;
        if(divisor == 1) return dividend;
        bool isPositive = true;
        if(dividend >= 0 && divisor < 0) 
            isPositive = false;
        if(dividend <= 0 && divisor > 0)
            isPositive = false;
        long n = abs((long)dividend);
        long d = abs((long)divisor);
        int ans = 0;
        while(n >= d) {
            int cnt = 0;
            while(n >= (d << (cnt+1))) {
                cnt++;
            }
            ans += (1 << cnt);
            n=n-(d << cnt);
        }
        if(ans == (1 << 31) && isPositive) 
            return INT_MAX;
        if(ans == (1 << 31) && isPositive==false)
            return INT_MIN;
        return isPositive ? ans : -ans;
    }
        
    
};