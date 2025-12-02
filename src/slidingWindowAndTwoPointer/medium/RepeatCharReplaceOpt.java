// 424. Longest Repeating Character Replacement
// Optimal Solution

class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int end=0;
        int maxLen=0;
        int maxFreq=0;
        while(end<s.length()){
            char ch=s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,map.get(ch));
            while((end-start+1)-maxFreq>k){
                char ch1=s.charAt(start);
                map.put(ch1,map.getOrDefault(ch1,0)-1);
                start++;
            }
            maxLen=Math.max(maxLen,end-start+1);
            end++;
        }
        return maxLen;
    }
}