


// 1614. Maximum Nesting Depth of the Parentheses
// optimal Solution
class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int cntMax=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                cnt++;
            }
            cntMax=Math.max(cntMax,cnt);
            if(ch==')'){
                cnt--;
            }
        }
        return cntMax;
    }
}