//151. Reverse Words in a String
// Brute force Solution
class Solution {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        String s1[]=s.trim().split("\\s+");
        int len=s1.length;
        for(int i=len-1;i>=0;i--){
            if(s1[i]==""){
                continue;
            }
            if(result.length()==0){
                result.append(s1[i]);
            }else{
                result.append(" ").append(s1[i]);
            }
        }
        return result.toString();
    }
}