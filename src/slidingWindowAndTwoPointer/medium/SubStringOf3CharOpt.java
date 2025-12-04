
// 1358. Number of Substrings Containing All Three Characters
// Optimal Solution

class Solution {
    public int numberOfSubstrings(String s) {
        if(s.length()==0){
            return 0;
        }

        int result=0;
        int start=0;
        int end=0;
        int n=s.length();
        int freq[]=new int[3];
        for(end=0;end<n;end++){
            freq[s.charAt(end)-'a']++;

            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                result=result+n-end;
                freq[s.charAt(start)-'a']--;
                start++;
            }
        }



        return result;
    }
}