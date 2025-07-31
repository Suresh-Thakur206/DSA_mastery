//class Solution {
//    public int majorityElement(int[] nums) {
//        int n=nums.length;
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<n;i++){
//            map.put(nums[i],0);
//        }
//        for(int i=0;i<n;i++){
//            map.put(nums[i],map.get(nums[i])+1);
//        }
//
//        for(Map.Entry<Integer,Integer> e: map.entrySet()){
//            int key=e.getKey();
//            int value=e.getValue();
//            if(value>n/2){
//                return key;
//            }
//        }
//        return -1;
//    }
//}