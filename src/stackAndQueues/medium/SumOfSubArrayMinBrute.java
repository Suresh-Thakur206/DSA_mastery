class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long sum=0;
        int mod=1000000007;
        for(int start=0;start<n;start++){
            int min=arr[start];
            for(int end=start;end<n;end++){
                min=Math.min(min,arr[end]);
                sum=(sum+min)%mod;
            }
        }
        return (int)sum;
    }
}