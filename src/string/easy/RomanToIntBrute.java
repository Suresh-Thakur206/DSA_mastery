

// 13. Roman to Integer
// Brute Force Solution
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        if(s.contains("IV")){
            sum+=4;
            s=s.replace("IV","");
        }
        if(s.contains("IX")){
            sum+=9;
            s=s.replace("IX","");
        }
        if(s.contains("XL")){
            sum+=40;
            s=s.replace("XL","");
        }
        if(s.contains("XC")){
            sum+=90;
            s=s.replace("XC","");
        }
        if(s.contains("CD")){
            sum+=400;
            s=s.replace("CD","");
        }
        if(s.contains("CM")){
            sum+=900;
            s=s.replace("CM","");
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='I'){
                sum+=1;
            }
            if(ch=='V'){
                sum+=5;
            }
            if(ch=='X'){
                sum+=10;
            } if(ch=='L'){
                sum+=50;
            }
            if(ch=='C'){
                sum+=100;
            }
            if(ch=='D'){
                sum+=500;
            }
            if(ch=='M'){
                sum+=1000;
            }
        }
        return sum;
    }
}