class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(map.containsKey(c)){
                if(map.get(c)==0){
                    return false;
                }else{
                    map.put(c,map.getOrDefault(c,0)-1);
                }
            }else{
                return false;
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}