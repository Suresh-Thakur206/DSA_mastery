// Check K-th Bit
// Simple Brute Force Solution

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        String str="";
        while(n>=1){

            if(n%2==1){
                str+='1';
            }else{
                str+='0';
            }
            n=n/2;
        }
        if(k>=str.length()){
            return false;
        }

        int value=str.charAt(k)-'0';
        if(value==0){
            return false;
        }
        return true;
    }
}