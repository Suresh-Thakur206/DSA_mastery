////680. Valid Palindrome II
//
//class Solution {
//    public boolean validPalindrome(String s) {
//        int n = s.length();
//        int left = 0;
//        int right = n - 1;
//        while (left <= right) {
//            if (left <= right && s.charAt(left) != s.charAt(right)) {
//                return isPalindrom(s, left+1, right) || isPalindrom(s, left, right-1);
//
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//
//    public boolean isPalindrom(String s, int left, int right) {
//        while (left <= right) {
//            if (left <= right && s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}