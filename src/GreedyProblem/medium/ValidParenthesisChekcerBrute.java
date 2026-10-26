
//678. Valid Parenthesis String

class Solution {

    public boolean check(String s,int i,int balance){
        if(i==s.length()){
            return balance==0;
        }

        if(balance<0){
            return false;
        }

        if(s.charAt(i)=='('){
            return check(s,i+1,balance+1);
        }else if(s.charAt(i)==')'){
            return check(s,i+1,balance-1);
        }else{
            return check(s,i+1,balance+1)
                    || check(s,i+1,balance-1)
                    ||check(s,i+1,balance);
        }

    }
    public boolean checkValidString(String s) {
        return check(s,0,0);
    }
}