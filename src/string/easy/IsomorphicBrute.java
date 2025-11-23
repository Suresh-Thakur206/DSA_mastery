

//205. Isomorphic Strings
// Brute Force Solution
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> first=new HashMap<>();

        HashMap<Character,Character> second=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            // from s -> t

            if(first.containsKey(c1)){
                if(first.get(c1)!=c2){
                    return false;
                }
            }else{
                first.put(c1,c2);
            }

            // for t -> s
            if(second.containsKey(c2)){
                if(second.get(c2)!=c1){
                    return false;
                }
            }else{
                second.put(c2,c1);
            }

        }
        return true;
    }
}