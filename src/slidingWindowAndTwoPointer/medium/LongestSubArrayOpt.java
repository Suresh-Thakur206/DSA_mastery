// Longest subarray with Atmost two distinct integers
// Optimal Solution

class Solution {
    public int totalElements(int[] arr) {
        // code here
        int len=arr.length;
        int maxLen=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        int start=0;

        for(int end=0;end<len;end++){
            freq.put(arr[end],freq.getOrDefault(arr[end],0)+1);
            while(freq.size()>2){
                freq.put(arr[start],freq.get(arr[start])-1);
                if(freq.get(arr[start])==0){
                    freq.remove(arr[start]);
                }
                start++;
            }
            maxLen=Math.max(maxLen,end-start+1);

        }
        return maxLen;
    }
}