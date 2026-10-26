
//860. Lemonade Change

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveDollar=0;
        int tenDollar=0;

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fiveDollar++;
            }
            if(bills[i]==10){
                if(fiveDollar>0){
                    fiveDollar--;
                    tenDollar++;
                }
                else return false;
            }
            if(bills[i]==20){
                if(fiveDollar>0 && tenDollar>0){
                    fiveDollar--;
                    tenDollar--;
                }else if(fiveDollar>=3){
                    fiveDollar-=3;
                }

                else{
                    return false;
                }
            }
        }
        return true;
    }
}