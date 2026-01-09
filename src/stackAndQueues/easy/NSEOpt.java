class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                list.add(-1);
            }else{
                list.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }

        return list;

    }
}