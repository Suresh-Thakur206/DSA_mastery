class Solution {
    public long countCommas(long n) {
        long result=0;
        long start=1;
        long countComma=0;
        while(start<=n){
            long end=start*1000-1;
            if(end>n){
                end=n;
            }
            if(countComma>0){
                result+=(end-start+1)*countComma;
            }
            start*=1000;
            countComma++;
        }
        return result;
    }
}