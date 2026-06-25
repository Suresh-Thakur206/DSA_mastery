//1922. Count Good Numbers
class Solution {
    static final long MOD=1000000007;

    public long findPow(long a,long b){
        if(b==0){
            return 1;
        }
        long half=findPow(a,b/2);
        long result=(half*half)%MOD;
        if(b%2==1){
            result=(result*a)%MOD;
        }


        long total=result%MOD;
        return (int)total;
    }
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;

        long evenPowCal=findPow(5,even);
        long oddPowCal=findPow(4,odd);


        return (int)((evenPowCal*oddPowCal)%MOD);



    }
}