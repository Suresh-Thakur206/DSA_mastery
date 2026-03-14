package tutorial.sort;

import java.util.ArrayList;

class Solution{
    public void mergBack(int []arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left++]);
            }else {
                temp.add(arr[right++]);
            }
        }

        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }
        for(int i=low; i<=high ; i++){
            arr[i]=temp.get(i-low);
        }
    }

    public void mergSort(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid = (low + high) / 2;
        mergSort(arr, low, mid);
        mergSort(arr, mid + 1, high);
        mergBack(arr, low, mid, high);
    }
}
public class MergeSort {
    public static void main(String[] args) {
        int arr[]={9,3,6,1,0,7,2,5};
        Solution solun = new Solution();
        solun.mergSort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num + ",");
        }
    }
}
