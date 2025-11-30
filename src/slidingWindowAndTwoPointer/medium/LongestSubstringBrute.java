// 3. Longest Substring Without Repeating Characters
// Brute Force Solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 ){
            return 0;
        }
        int len=s.length();
        int maxfreq=0;
        for(int i=0;i<len;i++){
            int freq[]=new int[256];
            int distinct=0;
            for(int j=i;j<len;j++){
                int index=(int)s.charAt(j);
                if(freq[index]==0){
                    distinct++;
                    maxfreq=Math.max(maxfreq,distinct);
                    freq[index]++;
                }else{
                    freq[index]++;
                }

                if(freq[index]==2){
                    distinct=0;
                    for(int k=0;k<distinct;k++){
                        freq[index]--;
                    }
                    break;
                }
            }
        }
        return maxfreq;
    }
}