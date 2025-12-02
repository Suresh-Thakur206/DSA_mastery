// 424. Longest Repeating Character Replacement
// Brute Force Solution

class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==0){
            return 0;
        }

        int n=s.length();
        int maxLen=0;

        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            int maxFreq=0;
            for(int j=i;j<n;j++){
                int index=s.charAt(j)-'A';
                freq[index]++;
                maxFreq=Math.max(maxFreq,freq[index]);
                if(j-i+1-maxFreq<=k){
                    maxLen=Math.max(maxLen,j-i+1);
                }

            }
        }

        return maxLen;
    }
}