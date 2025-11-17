//class Solution {
//    public int minLengthAfterRemovals(String s) {
//        if(s.length()==0){
//            return 0;
//        }
//        int n=s.length();
//        char []arr=s.toCharArray();
//        int left=0;
//        int right=n-1;
//        int cnt=0;
//        while(left<=right){
//            if(left==right){
//                if(arr[left]=='a'){
//                    cnt++;
//                    break;
//                }else{
//                    break;
//                }
//            }
//            if(arr[left]=='a'){
//                cnt++;
//                left++;
//            }else{
//                left++;
//            }
//            if(arr[right]=='a'){
//                cnt++;
//                right--;
//            }else{
//                right--;
//            }
//
//        }
//
//        // for b
//        left=0;
//        right=n-1;
//        int cnt1=0;
//        while(left<=right){
//            if(left==right){
//                if(arr[left]=='b'){
//                    cnt1++;
//                    break;
//                }else{
//                    break;
//                }
//            }
//            if(arr[left]=='b'){
//                cnt1++;
//                left++;
//            }else{
//                left++;
//            }
//            if(arr[right]=='b'){
//                cnt1++;
//                right--;
//            }else{
//                right--;
//            }
//
//        }
//        int diff=cnt-cnt1;
//        if(diff<0){
//            return (-diff);
//        }
//        return diff;
//    }
//}©leetcode