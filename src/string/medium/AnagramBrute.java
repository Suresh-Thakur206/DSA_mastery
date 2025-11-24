// 242. Valid Anagram
// Optimal solution

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char []ch1=t.toCharArray();
        for(int i=0 ; i<s.length();i++){
            char ch=s.charAt(i);
            Boolean flag=false;
            for(int j=0;j<s.length();j++){
                if(ch==ch1[j]){
                    ch1[j]='*';
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }

        return true;
    }
}