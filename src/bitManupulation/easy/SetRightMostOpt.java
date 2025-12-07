// Set the rightmost unset bit
// Optimal Solution

class Solution {
    static int setBit(int n) {
        // code here
        return n | (n+1);
    }
}