class Solution {
    public static int countSetBits(int n) {
        // code here
        if(n==0){
            return 0;
        }
        int x=highestPowerofN(n);

        int bitUpTo2x = x*(1<<(x-1));

        int msb=n-(1<<x)+1;
        int rest = n-(1<<x);

        return bitUpTo2x + msb + countSetBits(rest);
    }
    public static int highestPowerofN(int n){
        int x=0;
        while((1<<x)<=n){
            x++;
        }
        return (x-1);
    }
}