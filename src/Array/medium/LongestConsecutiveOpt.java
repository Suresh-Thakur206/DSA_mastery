// 128. Longest Consecutive Sequence
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }

        int max=0;
        for(int n : set){

            if(!set.contains(n-1)){
                int current=n;
                int count=1;

                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}