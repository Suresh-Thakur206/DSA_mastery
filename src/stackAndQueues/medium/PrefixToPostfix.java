// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=pre_exp.length()-1;i>=0;i--){
            char ch=pre_exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            }else{
                sb.setLength(0);
                String op1=stack.pop();
                String op2=stack.pop();
                sb.append(op1).append(op2).append(ch);
                stack.push(sb.toString());
            }
        }
        return stack.pop();
    }
}
