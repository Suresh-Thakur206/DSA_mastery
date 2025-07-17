package TwoPointer;
import java.util.Scanner;

public class MoveZero {
    public static int[] show(int []nums){
        int n=nums.length;
        int left=0;
        int right=n-1;
        while (left<right){
            if(nums[left]==0&&nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
                right--;
            } else if (nums[left]!=0&&nums[right]!=0) {
                left++;


            }
            else if(nums[left]==0&&nums[right]==0) {
                left++;
            }
            else{
                System.out.println("hello");
            }

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

        int []k=show(nums);
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
        }
    }

}
