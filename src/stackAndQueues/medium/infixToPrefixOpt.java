class Solution {

    static int prec(char c) {
        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;
        return -1;
    }

    static String infixToPostfixForPrefix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            }
            else if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                st.pop();
            }
            else {
                while (!st.isEmpty() &&
                        (prec(c) < prec(st.peek()) ||
                                (prec(c) == prec(st.peek()) && c == '^'))) {
                    res.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();
    }

    public String infixToPrefix(String s) {

        // reverse infix
        StringBuilder sb = new StringBuilder(s).reverse();

        // swap brackets
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }

        // postfix then reverse
        String postfix = infixToPostfixForPrefix(sb.toString());
        return new StringBuilder(postfix).reverse().toString();
    }
}
