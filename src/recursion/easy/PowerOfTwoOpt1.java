 // 231. Power of Two
 // Optimal Solution 1

class Solution {
    public int check(int n){
        if(n<=0) return n;
        if(n==1) return 1;

        if(n%2!=0) return n;
        return check(n/2);
    }
    public boolean isPowerOfTwo(int n) {
        int k=check(n);
        return k==1;
    }
}