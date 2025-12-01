// Longest subarray with Atmost two distinct integers
// Brute Froce Solution

class Solution {
    public int totalElements(int[] arr) {
        // code here
        int len=arr.length;
        int maxLen=0;
        for(int i=0;i<len;i++){
            HashMap<Integer,Integer> freq=new HashMap<>();
            int distinct=0;
            for(int j=i;j<len;j++){
                int pick=arr[j];
                freq.put(pick,freq.getOrDefault(pick,0)+1);
                if(freq.get(pick)==1){
                    distinct++;
                }
                if(distinct>2){
                    break;
                }
                maxLen=Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
}