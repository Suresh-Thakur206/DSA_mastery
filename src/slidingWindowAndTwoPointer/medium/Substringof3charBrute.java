// 1358. Number of Substrings Containing All Three Characters
// Brute Force Solution

class Solution {
    public int numberOfSubstrings(String s) {
        if(s.length()==0){
            return 0;
        }
        int n=s.length();
        int result=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[3];
            int count=0;
            for(int j=i;j<n;j++){
                int index=s.charAt(j)-'a';
                if(freq[index]==0){
                    count++;
                    freq[index]++;
                }

                if(count==3){
                    result+=n-j;
                    break;
                }
            }
        }
        return result;
    }
}

