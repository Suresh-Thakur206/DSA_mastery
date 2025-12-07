//Set the rightmost unset bit
// Brute Force Solution



class Solution {
    static int setBit(int n) {
        // code here
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        sb.reverse();
        int sum=0;
        int p=1;
        int count=0;
        for(int i=sb.length()-1;i>=0;i--){
            int index=sb.charAt(i)-'0';
            if(index==0 && count==0){
                // sb.setCharAt(i,'1');
                index=1;
                count++;
            }
            if(index==1){
                sum+=index*p;
            }
            p=p*2;
        }
        if(count==0){
            sum+=1*p;
        }
        return sum;
    }
}