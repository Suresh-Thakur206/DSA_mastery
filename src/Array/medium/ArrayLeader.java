//class Solution {
//    static ArrayList<Integer> leaders(int arr[]) {
//        ArrayList<Integer> list=new ArrayList<>();
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            boolean isLeader=true;
//            for(int j=i+1;j<n;j++){
//                if(arr[j]>arr[i]){
//                    isLeader=false;
//                    break;
//                }
//            }
//            if(isLeader){
//                list.add(arr[i]);
//            }
//        }
//        return list;
//    }
//}
