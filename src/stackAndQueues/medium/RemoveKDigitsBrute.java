class Solution {
    String min = null;

    public String removeKdigits(String num, int k) {
        dfs(num, k);

        // remove leading zeros
        int i = 0;
        while (i < min.length() && min.charAt(i) == '0') {
            i++;
        }

        String res = min.substring(i);
        return res.isEmpty() ? "0" : res;
    }

    private void dfs(String num, int k) {
        // If no more removals left
        if (k == 0) {
            if (min == null || isSmaller(num, min)) {
                min = num;
            }
            return;
        }

        // If string becomes empty
        if (num.length() == 0) return;

        // Try removing each digit
        for (int i = 0; i < num.length(); i++) {
            String next = num.substring(0, i) + num.substring(i + 1);
            dfs(next, k - 1);
        }
    }

    // Compare two numeric strings
    private boolean isSmaller(String a, String b) {
        a = trimLeadingZeros(a);
        b = trimLeadingZeros(b);

        if (a.length() != b.length()) {
            return a.length() < b.length();
        }
        return a.compareTo(b) < 0;
    }

    private String trimLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') i++;
        return i == s.length() ? "0" : s.substring(i);
    }
}
