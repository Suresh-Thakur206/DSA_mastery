//class Solution {
//    public int majorityElement(int[] nums) {
//        int n=nums.length;
//
//        //check for negative number
//        boolean istrue=false;
//        for(int i=0;i<n;i++){
//            if(nums[i]<0){
//                istrue=true;
//                break;
//            }
//        }
//
//        // when negeteve element is present
//        if(istrue==true){
//            // finding the minimum number
//            int min=nums[0];
//            for(int i=1;i<nums.length;i++){
//                if(nums[i]<min){
//                    min=nums[i];
//                }
//            }
//
//            // making the array element positive
//            int min2=-1*min;
//            for(int i=0;i<nums.length;i++){
//                nums[i]+=min2;
//            }
//            int max1=nums[0];
//            for(int i=1;i<n;i++){
//                if(nums[i]>max1){
//                    max1=nums[i];
//                }
//            }
//
//            int arr[]=new int[max1+1];
//            for(int i=0;i<n;i++){
//                int count=0;
//                int value=nums[i];
//                for(int j=i;j<n;j++){
//                    if(nums[j]==nums[i]){
//                        count++;
//                    }
//                }
//                if(arr[value]==0){
//                    arr[value]=count;
//                }
//            }
//
//            int element=0;
//
//            int max=arr[0];
//            for(int i=0;i<arr.length;i++){
//                if(arr[i]>max){
//                    max=arr[i];
//                    element=i;
//                }
//
//            }
//            return element-min2;
//
//        }
//
//        // when not negative value
//
//        //max element finding
//        int max1=nums[0];
//        for(int i=1;i<n;i++){
//            if(nums[i]>max1){
//                max1=nums[i];
//            }
//        }
//        //count the frequency
//        int arr[]=new int[max1+1];
//        for(int i=0;i<n;i++){
//            int count=0;
//            int value=nums[i];
//            for(int j=i;j<n;j++){
//                if(nums[j]==nums[i]){
//                    count++;
//                }
//            }
//            if(arr[value]==0){
//                arr[value]=count;
//            }
//        }
//
//        int element=0;
//
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//                element=i;
//            }
//        }
//
//
//        return element;
//    }
//
//}
//
