//class KthLargest {
//    int k;
//    ArrayList<Integer> list=new ArrayList<>();
//
//
//    public KthLargest(int k, int[] nums) {
//        this.k=k;
//        for(int i=0;i<nums.length;i++){
//            list.add(nums[i]);
//        }
//
//    }
//
//    public int add(int val) {
//        list.add(val);
//        for(int i=0;i<list.size()-1;i++){
//            for(int j=i+1;j<list.size();j++){
//                if(list.get(j)>list.get(i)){
//                    int temp=list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j,temp);
//                }
//            }
//        }
//        int value=list.get(k-1);
//        return value;
//
//    }
//}
//
///**
// * Your KthLargest object will be instantiated and called as such:
// * KthLargest obj = new KthLargest(k, nums);
// * int param_1 = obj.add(val);
// */