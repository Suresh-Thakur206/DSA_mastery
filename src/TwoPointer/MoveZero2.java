package TwoPointer;


import java.util.Scanner;

public class MoveZero2 {
    public static void show(int []nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (nums[left] == 0&&nums[right]!=0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            } else {
                left++;
            }
        }

        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (nums[l] != 0 && nums[r] == 0) {
                r--;
            } else if (nums[l] != 0 && nums[r] != 0 && nums[l] > nums[r]) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            } else {
                nums[l]=nums[l]+0;
            }
        }
        for (int i = 0; i < n; i++)
        {
                System.out.print(nums[i] + " ");

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
//        int []k=nums;
//        for(int i=0;i<k.length;i++){
//            System.out.print(k[i]+" ");
//        }
    }

}

