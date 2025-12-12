class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();

        int xor=0;

        for(int val:arr){
            xor^=val;
        }
        int num1=0;
        int num2=0;
        int setBit=xor&-xor;
        for(int val:arr){
            if((setBit&val)!=0){
                num1^=val;
            }else{
                num2^=val;
            }
        }
        if(num1>num2){
            list.add(num1);
            list.add(num2);
        }else{
            list.add(num2);
            list.add(num1);
        }
        return list;
    }
}
