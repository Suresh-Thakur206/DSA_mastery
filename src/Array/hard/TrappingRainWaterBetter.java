class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[][] leftRight = new int[n][2];

        // Handling left tallest
        int max = height[0];
        leftRight[0][0] = height[0];

        for (int i = 1; i < n; i++) {
            leftRight[i][0] = max;
            max = Math.max(max, height[i]);
        }

        // Handling right tallest
        max = height[n - 1];
        leftRight[n - 1][1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            leftRight[i][1] = max;
            max = Math.max(max, height[i]);
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int leftMax = leftRight[i][0];
            int rightMax = leftRight[i][1];

            int waterLevel = Math.min(leftMax, rightMax);

            if (waterLevel > height[i]) {
                sum += waterLevel - height[i];
            }
        }

        return sum;
    }
}