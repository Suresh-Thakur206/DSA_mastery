// User function Template for Java

class Solution {

    public int leftChild(int i){
        return (i*2+1);
    }
    public int rightChild(int i){
        return (i*2+2);
    }

    public boolean countSub(long arr[], long n) {
        boolean status=false;
        // Your code goes here
        for(int i=0;i<arr.length;i++){


            int lc=leftChild(i);
            int rc=rightChild(i);
            if((lc<arr.length && rc<arr.length && (arr[i]<arr[lc] || arr[i]<arr[rc]))
                    || (lc<arr.length && rc>=arr.length && arr[i]<arr[lc]) ){
                status=true;
                return false;

            }
        }
        if(!status){
            return true;

        }
        return false;
    }
}