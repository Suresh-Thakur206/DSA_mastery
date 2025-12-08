
class Solution {
    public int divide(int dividend, int divisor) {

        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }

        int sign=1;
        if(dividend<0){
            sign=-sign;
            dividend=-dividend;
        }
        if(divisor<0){
            sign=-sign;
            divisor=-divisor;
        }

        int sum=0;
        int count=0;
        while(sum+divisor<=dividend){
            sum+=divisor;
            count++;
        }
        return (count*sign);
    }
}