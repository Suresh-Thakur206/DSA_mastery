package BinarySearch.medium;
import java.util.Scanner;

public class RotatedArray2 {
    public static int RotatedArray(int[]nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if (nums[left]<=nums[mid]){
                if(nums[left]<=target&& target<=nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target :");
        int target=sc.nextInt();
        int []nums={4,5,6,7,0,1,2};
        int n=RotatedArray(nums,target);
        System.out.println("index is : "+n);

    }
}
