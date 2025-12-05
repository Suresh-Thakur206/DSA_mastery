// 1423. Maximum Points You Can Obtain from Cards
 // Brute Force Solution Solution

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int maxPoint=0;
        for(int i=0;i<=k;i++){
            int sum=0;
            for(int a=0;a<i;a++){
                sum+=cardPoints[a];
            }
            for(int b=0;b<k-i;b++){
                sum+=cardPoints[n-1-b];
            }
            maxPoint=Math.max(maxPoint,sum);
        }
        return maxPoint;
    }
}