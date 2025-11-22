// 1903. Largest Odd Number in String
//Brute Solution

class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        for(int i = len; i >0; i--){
            String str = num.substring(0, i);
            char ch = str.charAt(str.length() - 1);
            if((ch - '0') % 2 != 0){
                return str;
            }
        }
        return "";
    }
}
