//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int n=nums.length;
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<n;i++){
//            map.put(nums[i],i);

//        }
//
//
//        for(int i=0;i<nums.length;i++){
//            int k=target-nums[i];


//            if(map.containsKey(k)&& map.get(k)!=i){
//                return new int[]{i,map.get(k)};
//            }
//        }
//        return new int[]{-1,-1};

//    }
//}