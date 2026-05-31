class Solution {

    long parse(String s,int i,long result,int sign,int phase){

        if(i==s.length()) return sign*result;

        if(i<s.length() && phase==0){
            if(s.charAt(i)==' '){
                return parse(s,i+1,0,1,0);
            }else{
                return parse(s,i,0,1,1);
            }
        }

        if(i<s.length() && phase==1){
            if(s.charAt(i)=='+') return parse(s,i+1,0,1,2);
            else if(s.charAt(i)=='-') return parse(s,i+1,0,-1,2);
            else return parse(s,i,0,1,2);
        }

        if(i<s.length() && !Character.isDigit(s.charAt(i))){
            return sign*result;
        }
        int digit=s.charAt(i)-'0';


        if(result>(Integer.MAX_VALUE-digit)/10){
            return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return parse(s,i+1,result*10+digit,sign,2);
    }
    public int myAtoi(String s) {
        long total=parse(s,0,0,1,0);

        return (int)Math.max(Integer.MIN_VALUE,Math.min(Integer.MAX_VALUE,total));
    }


}