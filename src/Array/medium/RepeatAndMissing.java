package Array.medium;

import java.util.Scanner;

public class RepeatAndMissing {
    public static void show(int []nums){
        int n=nums.length;
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]){
                    arr[0]=nums[j];
                }
            }
        }
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[j]==k){
                    k++;
                }
                else{
                    arr[1]=nums[j];
                }
            }

        }
        for(int i=0;i<2;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element ; ");
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        show(nums);

    }
}
