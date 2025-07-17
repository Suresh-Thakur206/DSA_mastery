package Array.medium;

import java.util.Scanner;

public class NextPermutation {
    public static int[] showData(int nums[]){
       int n=nums.length;
       for(int i=n-1;i>0;i--){  
           if(nums[i-1]<nums[i]){
               for(int j=n-1;j>=i;j--){
                   if(nums[j]>nums[i-1]){
                       int temp=nums[i-1];
                       nums[i-1]=nums[j];
                       nums[j]=temp;

                       int left=i;
                       int right=n-1;
                       while(left<right){
                           int temp3=nums[left];
                           nums[left]=nums[right];
                           nums[right]=temp3;
                           left++;
                           right--;
                       }
                       return nums;
                   }
               }

           }
       }
       int l=0;
       int r=n-1;
       while(l<r){
           int temp=nums[r];
           nums[r]=nums[l];
           nums[l]=temp;
           l++;
           r--;
       }
       return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int []k=showData(nums);
        for (int i : k) {
            System.out.print(i+" ");
        }
    }
}
