class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer , Integer > map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> even : map.entrySet()){
            if(even.getValue() == 1 ){
                int key = even.getKey();
                if(key % 2 == 0 ){
                    list.add(key);
                }
            }

        }
        if(list.size()==0){
            return -1;
        }

        int minIndex = Integer.MAX_VALUE;

        for(int i=0;i<list.size();i++){
            int value = list.get(i);
            for(int j=0;j<nums.length;j++){
                if(nums[j]==value){
                    minIndex = Math.min(minIndex,j);
                }
            }
        }

        return nums[minIndex];
    }
}©leetcode