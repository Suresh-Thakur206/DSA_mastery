// Number of 1 Bits
// Brute Force Solution
class Solution {
    static int setBits(int n) {
        // code here
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        int count=0;
        for(int i=0;i<sb.length();i++){
            int value=sb.charAt(i)-'0';
            if(value==1){
                count++;
            }
        }
        return count;
    }
}