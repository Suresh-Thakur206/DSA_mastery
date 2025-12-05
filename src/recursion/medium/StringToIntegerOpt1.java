// 8. String to Integer (atoi)
// Optimal Solution (Iterative Solution)

class Solution {
    public int myAtoi(String s) {
        int sign=1;
        int n=s.length();
        int i=0;
        int result=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n){
            if(s.charAt(i)=='-'){
                sign=-1;
                i++;
            }else if(s.charAt(i)=='+'){
                sign=1;
                i++;
            }
        }

        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit=s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result=result*10+digit;
            i++;
        }
        return result*sign;
    }
}