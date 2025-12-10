class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> mainList=new ArrayList<>();
        int n=nums.length;
        int total=1<<n;

        for(int mask=0;mask<total;mask++){
            List<Integer> subList=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mask & (1<<i)) !=0){
                    subList.add(nums[i]);
                }
            }
            mainList.add(subList);
        }
        return mainList;
    }
}