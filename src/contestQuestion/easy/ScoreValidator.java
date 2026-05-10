//Q1. Score Validator
class Solution {
    public int[] scoreValidator(String[] events) {
        int n=events.length;
        int score=0;
        int counter=0;
        for(int i=0;i<n;i++){
            int len=events[i].length();
            if(len==1){
                for(int j=0;j<1;j++){
                    char ch=events[i].charAt(j);
                    if(ch<'0' || ch>'9'){
                        counter++;
                        if(counter==10){
                            return new int[]{score,counter};
                        }

                    }else{
                        score+=ch-'0';
                    }

                }
            }else{
                score+=1;
            }

        }
        return new int[]{score,counter};
    }
}