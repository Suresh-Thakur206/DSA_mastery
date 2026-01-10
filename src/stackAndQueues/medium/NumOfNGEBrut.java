
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int n1=indices.length;
        int n2=arr.length;
        int []res=new int[n1];
        for(int i=0;i<n1;i++){
            int count=0;
            int k=indices[i];
            for(int j=k+1;j<n2;j++){
                if(arr[j]>arr[k]){
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
}
