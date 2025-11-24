

// 451. Sort Characters By Frequency
// Brute Force Solution
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder result=new StringBuilder();
        while(!map.isEmpty()){
            int max=0;
            char chMax=0;
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    chMax=entry.getKey();
                }
            }
            for(int i=0;i<max;i++){
                result.append(chMax);
            }
            map.remove(chMax);
        }
        return result.toString();
    }
}