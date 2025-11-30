
// 3. Longest Substring Without Repeating Characters
// Medium Optimal Solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int len=s.length();
        int maxLen=Integer.MIN_VALUE;
        int windowStart=0;
        int windowEnd=0;
        while(windowEnd<len){
            char ch=s.charAt(windowEnd);
            if(set.contains(ch)){
                while(windowStart<windowEnd && set.contains(ch)){
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
            }
            set.add(ch);
            maxLen=Math.max(maxLen,windowEnd-windowStart+1);
            windowEnd++;
        }
        return (maxLen==Integer.MIN_VALUE)? 0 : maxLen;
    }
}