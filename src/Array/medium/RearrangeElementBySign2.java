//class Solution {
//    public int[] rearrangeArray(int[] nums) {
//        int n=nums.length;
//        ArrayList<Integer> v1=new ArrayList<>();
//        ArrayList<Integer> v2=new ArrayList<>();
//        ArrayList<Integer> ans=new ArrayList<>();
//
//        for(int num:nums){
//            if(num>0){
//                v1.add(num);
//            }else{
//                v2.add(num);
//            }
//        }
//
//        int ind1=0;
//        int ind2=0;
//        while(ind1<(n/2)){
//            ans.add(v1.get(ind1));
//            ind1++;
//            ans.add(v2.get(ind2));
//            ind2++;
//        }
//
//        int result[]=new int[ans.size()];
//        for(int i=0;i<ans.size();i++){
//            result[i]=ans.get(i);
//        }
//        return result;
//    }
//}