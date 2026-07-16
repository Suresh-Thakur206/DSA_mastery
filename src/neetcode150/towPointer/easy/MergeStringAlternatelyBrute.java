class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();


        String ans="";

        int len = Math.min(n1, n2);

        for (int i = 0; i < len; i++) {


            ans=ans+word1.charAt(i);
            ans=ans+word2.charAt(i);
        }
        while (len< n1) {
            ans=ans+word1.charAt(len);
            len++;
        }
        while (len< n2) {
            ans=ans+word2.charAt(len);
            len++;
        }

        return ans;

    }
}