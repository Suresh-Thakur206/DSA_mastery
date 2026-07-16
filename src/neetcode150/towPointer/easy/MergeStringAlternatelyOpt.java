//Merge Strings Alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();


        StringBuilder sb = new StringBuilder();

        int len = Math.min(n1, n2);

        for (int i = 0; i < len; i++) {


            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));



        }
        while (len< n1) {
            sb.append(word1.charAt(len));
            len++;
        }
        while (len< n2) {
            sb.append(word2.charAt(len));
            len++;
        }

        return sb.toString();

    }
}