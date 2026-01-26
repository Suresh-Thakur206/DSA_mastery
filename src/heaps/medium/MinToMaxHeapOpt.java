// User function Template for Java

class Solution {
    public static void maxHeapify(int[]arr,int n,int i){
        int largest=i;
        int leftChild=i*2+1;
        int rightChild=i*2+2;
        if(leftChild<n && arr[leftChild]>arr[largest]){
            largest=leftChild;
        }
        if(rightChild<n && arr[rightChild]>arr[largest]){
            largest=rightChild;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            maxHeapify(arr,n,largest);
        }

    }
    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
        for(int i=N/2-1;i>=0;i--){
            maxHeapify(arr,N,i);
        }
    }
}
