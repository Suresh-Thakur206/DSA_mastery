class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }


        while(k>0){
            int max=Integer.MIN_VALUE;
            int key = Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                int value = entry.getValue();
                if(value>max){
                    key =entry.getKey();
                }
                max=Math.max(max,value);

            }
            list.add(key);
            map.remove(key);
            k--;

        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}