class Solution {
    public static int countSetBits(int n) {
        // code here
        int count=0;
        for(int i=1;i<=n;i++){
            int k=i;
            while(k>0){
                count+=(k&1);
                k=k>>1;
            }
        }
        return count;
    }
}