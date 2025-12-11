// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {

        int result=0;
        while(l<=r){
            result^=l;
            l++;
        }
        return result;
    }
}