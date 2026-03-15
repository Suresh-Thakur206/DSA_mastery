class Solution {
    public int countCommas(int n) {
        int count = 0;
        int comma = 0;
        int temp=n;
        while(temp>0){
            count++;
            temp=temp/10;

        }
        if(count<=3){
            return 0;
        }else {
            int diff = n - 1000;
            comma = diff + 1;
        }

        return comma;
    }
}©leetcode