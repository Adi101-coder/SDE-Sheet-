import java.util.*;
class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        int m=n;
        long nn=Math.abs((long)n);
        while(nn>0)
        {
            if(nn%2==1)
            {
                ans=ans*x;
                nn--;
            }
            else {
                nn=nn/2;
                x=x*x;
            }
        }
            if(m>0) return ans;
            return 1.0/ans;
    }
}