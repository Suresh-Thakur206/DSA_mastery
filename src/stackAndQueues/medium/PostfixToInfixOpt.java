// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            }else{

                String operand1=stack.pop();
                String operand2=stack.pop();
                String res="("+operand2+String.valueOf(ch)+operand1+")";
                stack.push(res);
            }
        }



        return stack.pop();
    }
}
