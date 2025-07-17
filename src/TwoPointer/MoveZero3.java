package TwoPointer;

import java.util.Scanner;

public class MoveZero3 {
    public static void show(int []nums){
        int n=nums.length;
        int st=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[st]=nums[i];
                st++;

            }
        }
        while(st<n){
            nums[st]=0;
            st++;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        show(nums);
    }
}
