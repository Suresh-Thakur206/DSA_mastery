// Substrings with K Distinct
// Brute Force Solution

class Solution {
    public int countSubstr(String s, int k) {
        //  code here
        int n=s.length();
        int count =0;
        for(int i=0;i<n;i++){
            int []freq=new int[26];
            int distinct=0;
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(freq[ch-'a']==0){
                    distinct++;
                }
                freq[ch-'a']++;
                if(distinct==k){
                    count++;
                }else if(distinct<k){
                    continue;
                }
                else if(distinct>k){
                    break;
                }
            }
        }
        return count;

    }
}