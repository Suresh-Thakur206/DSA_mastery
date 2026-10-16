// Minimum Coint GFG

class Solution {
    public int findMin(int n) {
        // code here
        int minCoin=0;
        while(n>0){
            if(n>=10){
                n-=10;
            }else if(n>=5){
                n-=5;
            }else if(n>=2){
                n-=2;
            }else{
                n-=1;
            }
            minCoin++;
        }
        return minCoin;
    }
}
