class Solution {
    public static int prec(char c){
        if(c=='^') return 3;
        else if (c=='*' || c=='/') return 2;
        else if (c=='+' || c=='-') return 1;
        else return -1;
    }
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> stack=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }else if(c=='('){
                stack.push(c);
            }else if(c==')'){
                while(stack.peek()!='('){
                    result.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && (prec(c)<prec(stack.peek()) || (prec(c)==prec(stack.peek()) && c!='^'))){
                    result.append(stack.pop());
                }
                stack.push(c);
            }

        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
    }
}