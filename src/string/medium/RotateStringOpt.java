
// 796. Rotate String
// optimal Solution
class Solution {
    public boolean rotateString(String s, String goal) {
        if( s.length() != goal.length()){
            return false;
        }
        String rotate=s+s;
        if(rotate.contains(goal)){
            return true;
        }
        return false;
    }
}