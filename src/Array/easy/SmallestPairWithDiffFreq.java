class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if(nums.length==1 || nums.length==0){
            return new int[]{-1,-1};
        }
        int n=nums.length;



        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int firstMin=Integer.MAX_VALUE;
        int firstKey=-1;
        int firstValue=-1;
        int secMin=Integer.MAX_VALUE;
        int secKey=-1;
        int secValue=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            firstMin=Math.min(firstMin,entry.getKey());
            firstKey=firstMin;
        }
        firstValue=map.get(firstMin);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()!=firstValue){
                secMin=Math.min(secMin,entry.getKey());
                secKey=secMin;
                secValue=entry.getValue();
            }
        }

        if(secValue==-1){
            return new int[]{-1,-1};
        }

        return new int[]{firstKey,secKey};
    }
}