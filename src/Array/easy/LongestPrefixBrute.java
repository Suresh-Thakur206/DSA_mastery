class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String first=strs[0];
        char ch[]=first.toCharArray();
        for(int i=0;i<ch.length;i++){
            char ch1=first.charAt(i);
            for(int j=1;j<strs.length;j++){

                if(i>=strs[j].length() || ch1!=strs[j].charAt(i)){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}