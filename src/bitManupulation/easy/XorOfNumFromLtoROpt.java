// User function Template for Java

class Solution {
    public static int xorToN(int n){
        if(n%4==0) return n;
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        return 0;
    }
    public static int findXOR(int l, int r) {

        return xorToN(r)^xorToN(l-1);
    }
}