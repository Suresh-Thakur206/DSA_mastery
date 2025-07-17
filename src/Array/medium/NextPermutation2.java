package Array.medium;

import java.util.Scanner;

public class NextPermutation2 {
    public static int[] showData(int nums[]){
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=arr[i]+nums[i];
        }
        return arr;
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
