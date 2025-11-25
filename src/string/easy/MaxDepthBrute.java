// 1614. Maximum Nesting Depth of the Parentheses
// optimal Solution

class Solution {
    public int maxDepth(String s) {
        int maxDepth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                int depth=0;
                int balance=0;

                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)=='('){
                        balance++;
                        depth=Math.max(depth,balance);
                    }else if(s.charAt(j)==')'){
                        balance--;
                        if(balance==0){
                            break;
                        }
                    }
                }
                maxDepth=Math.max(maxDepth,depth);
            }

        }
        return maxDepth;
    }
}