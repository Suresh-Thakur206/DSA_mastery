class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        while(start>0){
            sb1.append(start%2);
            start=start/2;
        }
        while(goal>0){
            sb2.append(goal%2);
            goal=goal/2;
        }
        int diff=Math.abs(sb1.length()-sb2.length());
        if(sb1.length()>sb2.length()){
            for(int i=0;i<diff;i++){
                sb2.append('0');
            }
            sb1.reverse();
            sb2.reverse();
        }else if(sb2.length()>sb1.length()){
            for(int i=0;i<diff;i++){
                sb1.append('0');
            }
            sb1.reverse();
            sb2.reverse();
        }else{
            sb1.reverse();
            sb2.reverse();
        }

        int count=0;
        for(int i=0;i<sb1.length();i++){
            if(sb1.charAt(i)==sb2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}