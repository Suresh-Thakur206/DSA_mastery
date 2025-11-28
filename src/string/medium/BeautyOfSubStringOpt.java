//1781. Sum of Beauty of All Substrings
// Optimal Solution

class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int totalCnt=0;
        for(int i=0;i<n;i++){
            int maxFreq=0;
            int []freq=new int[26];
            for(int j=i;j<n;j++){
                int index=s.charAt(j)-'a';
                freq[index]++;
                maxFreq=Math.max(maxFreq,freq[index]);

                int minFreq=Integer.MAX_VALUE;

                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        minFreq=Math.min(minFreq,freq[k]);
                    }
                }

                totalCnt+=(maxFreq-minFreq);
            }
        }
        return totalCnt;
    }
}