// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<post_exp.length();i++){
            char ch=post_exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            }else{
                sb.setLength(0);
                String op1=stack.pop();
                String op2=stack.pop();
                sb.append(ch).append(op2).append(op1);
                stack.push(sb.toString());
            }
        }
        return stack.pop();
    }
}
