// 3. Longest Substring Without Repeating Characters
// Optimal Solution

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=s.length();
        int maxLen=Integer.MIN_VALUE;
        int windowStart=0;
        int windowEnd=0;
        while(windowEnd<len){
            char ch=s.charAt(windowEnd);
            if(map.containsKey(ch) && map.get(ch)>=windowStart){
                windowStart=map.get(ch)+1;
            }
            map.put(ch,windowEnd);
            maxLen=Math.max(maxLen,windowEnd-windowStart+1);
            windowEnd++;
        }
        return (maxLen==Integer.MIN_VALUE)? 0 : maxLen;
    }
}