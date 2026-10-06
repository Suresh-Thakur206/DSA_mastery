
//455. Assign Cookies

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childP = 0;
        int cookiesP = 0;
        int n = g.length;
        int m = s.length;

        while (childP < n && cookiesP < m) {
            if (s[cookiesP]>=g[childP]) {

                childP++;
                cookiesP++;

            } else {
                cookiesP++;
            }
        }
        return childP;
    }
}