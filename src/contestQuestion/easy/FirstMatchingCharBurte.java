
// 3884. First Matching Character From Both Ends
class Solution {
    public int firstMatchingIndex(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            list.add(ch);
        }
        for(int i=0;i<list.size();i++){
            int index=s.length()-i-1;
            char ch1=list.get(index);
            if(list.get(i)==ch1){
                return i;
            }

        }
        return -1;
    }
}