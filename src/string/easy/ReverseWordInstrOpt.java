//151. Reverse Words in a String
// Optimal Solution

class Solution {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        int stIdx=s.length()-1;
        while(stIdx>=0){
            while(stIdx>=0 && s.charAt(stIdx)==' '){
                stIdx--;
            }
            if(stIdx<0){
                break;
            }
            int endIdx=stIdx;
            while( stIdx>=0 && s.charAt(stIdx)!=' '){
                stIdx--;
            }
            if(result.length()==0){
                result.append(s.substring(stIdx+1,endIdx+1));
            }else{
                result.append(" ");
                result.append(s.substring(stIdx+1,endIdx+1));
            }
        }
        return result.toString();
    }
}