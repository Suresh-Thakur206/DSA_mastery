
// 8. String to Integer (atoi)
// Optimal Solution
class Solution {
    public int myAtoi(String s) {
        int i=0, n=s.length();
        int sign=1;
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

        while(i<n &&s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit=s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE -digit)/10){
                return (sign==1)? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result=result*10+digit;
            i++;
        }

        return result*sign;
    }
}