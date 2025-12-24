//// User function Template for Java
//
//class Solution {
//
//
//    public static String postToInfixConvert(String oldString){
//        Stack<String> stack=new Stack<>();
//        for(int i=0;i<oldString.length();i++){
//            char ch=oldString.charAt(i);
//            if(Character.isLetterOrDigit(ch)){
//                stack.push(String.valueOf(ch));
//            }else{
//
//                String operand1=stack.pop();
//                String operand2=stack.pop();
//                String res="("+operand2+String.valueOf(ch)+operand1+")";
//                stack.push(res);
//            }
//
//        }
//        return stack.pop();
//
//    }
//    static String preToInfix(String pre_exp) {
//        // code here
//        StringBuilder sb=new StringBuilder(pre_exp);
//        sb.reverse();
//        String newString=postToInfixConvert(sb.toString());
//        sb.setLength(0);
//        sb.append(newString).reverse();
//        for(int i=0;i<sb.length();i++){
//            if(sb.charAt(i)==')'){
//                sb.setCharAt(i,'(');
//            }else if(sb.charAt(i)=='('){
//                sb.setCharAt(i,')');
//            }
//        }
//        return sb.toString();
//
//    }
//
//}
